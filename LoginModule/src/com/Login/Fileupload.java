package com.Login;

import java.awt.List;
import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.*;
import org.apache.catalina.startup.HomesUserDatabase;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 * Servlet implementation class Fileupload
 */
@WebServlet("/Fileupload")
public class Fileupload extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	
	{
		// TODO Auto-generated method stub
		ServletFileUpload sf = new ServletFileUpload(new DiskFileItemFactory());
		try {
			java.util.List<FileItem> multifiles = sf.parseRequest(request);
			
			for(FileItem item: multifiles)
			{
				try {
					item.write(new File("/home/manu/eclipse-workspace/LoginModule/" +item.getName()));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("File Uploaded");
		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		
	}

}
