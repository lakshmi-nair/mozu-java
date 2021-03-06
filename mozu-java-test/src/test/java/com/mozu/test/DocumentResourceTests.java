package com.mozu.test;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.PrintWriter;

import org.apache.http.HttpStatus;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.mozu.api.ApiContext;
import com.mozu.api.DataViewMode;
import com.mozu.api.MozuApiContext;
import com.mozu.api.contracts.content.Document;
import com.mozu.api.contracts.content.DocumentList;
import com.mozu.api.contracts.content.DocumentType;
import com.mozu.api.security.AppAuthenticator;
import com.mozu.api.utils.MozuHttpClientPool;
import com.mozu.test.framework.core.MozuApiTestBase;
import com.mozu.test.framework.datafactory.DocumentFactory;
import com.mozu.test.framework.datafactory.DocumentListFactory;
import com.mozu.test.framework.datafactory.DocumentTypeFactory;
import com.mozu.test.framework.helper.Generator;

public class DocumentResourceTests extends MozuApiTestBase {
	
	private static ApiContext apiContext;
	private static int CONTENTLENGTH = 200;
	private static String CONTENTTYPE =  "text/plain";
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		MozuHttpClientPool.getInstance().shutdown();
	}

	@Before
	public void setUp() throws Exception {
		apiContext = new MozuApiContext(tenantId, null, null, null);
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public void UpdateDocumentContentTest1() throws Exception {
        String appId = AppAuthenticator.getInstance().getAppAuthInfo().getApplicationId();        
		String mozuNamespace = appId.substring(0, appId.indexOf('.'));
		DocumentList list = com.mozu.test.framework.helper.DocumentGenerator.generateDocumentList(mozuNamespace, "QA");
        DocumentList existing = null;        
        try{
            existing = DocumentListFactory.getDocumentList(apiContext, DataViewMode.Live, list.getName()+"@"+list.getNamespace(), HttpStatus.SC_OK);
        } 
        catch(Exception ae) {
        }
        if (existing == null)
        	list = DocumentListFactory.createDocumentList(apiContext, DataViewMode.Live, list, HttpStatus.SC_CREATED);
        else
        	list = existing;
        
		DocumentType type = com.mozu.test.framework.helper.DocumentGenerator.generateDocumentType(mozuNamespace, "QAText");
        DocumentType existingType = null;        
        try{
            existingType = DocumentTypeFactory.getDocumentType(apiContext, DataViewMode.Live, type.getName()+"@"+type.getNamespace(), HttpStatus.SC_OK);
        } 
        catch(Exception ae) {
        }
        if (existingType == null)
        	type = DocumentTypeFactory.createDocumentType(apiContext, DataViewMode.Live, type, HttpStatus.SC_CREATED);
        else
        	type = existingType;

        String fileName = Generator.randomString(5, Generator.AlphaChars);
        File file = new File("C:\\tmp\\" + fileName + ".txt");
        String content = Generator.randomString(CONTENTLENGTH, Generator.AlphaChars);
		if (file.exists()) {
			file.delete();
		}
		PrintWriter writer = new PrintWriter(file);
		writer.print(content);
		writer.close();
		 
		Document doc = new Document();
		doc.setContentMimeType(CONTENTTYPE);
		doc.setExtension("txt");
		doc.setName(fileName);
		doc.setDocumentTypeFQN(type.getDocumentTypeFQN());
		
		Document newDoc = DocumentFactory.createDocument(apiContext, DataViewMode.Live, doc, list.getListFQN(), HttpStatus.SC_CREATED);

		FileInputStream inputStream = new FileInputStream(file);
		DocumentFactory.updateDocumentContent(apiContext, inputStream, list.getListFQN(), newDoc.getId(),
				CONTENTTYPE, HttpStatus.SC_OK);
		 		 
		Document docResponse = DocumentFactory.getDocument(apiContext, DataViewMode.Live, list.getListFQN(), newDoc.getId(), HttpStatus.SC_OK);
		assertEquals(CONTENTLENGTH, docResponse.getContentLength().intValue());
		file.delete();
	}
	
}