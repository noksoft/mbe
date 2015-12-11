package mx.com.nok.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import flex.messaging.FlexContext;

public class FileUtils {
	
	/**
	 * @param args
	 */
	public static void uploadFile(String name, byte[] content, int createFolder){
		String outputfile = "";

		try {
			switch(createFolder){
				case 1:
						outputfile = FlexContext.getServletContext().getRealPath("\\images\\fotos\\"+name);
						//outputfile = "D:\\NOK\\images\\fotos\\"+name;

					break;
				case 2:
						outputfile = FlexContext.getServletContext().getRealPath("\\images\\facturas\\"+name);
						//outputfile = "D:\\NOK\\images\\facturas\\"+name;
					break;
				case 3:
						outputfile = FlexContext.getServletContext().getRealPath("\\images\\pedimentos\\"+name);
						//outputfile = "D:\\NOK\\images\\pedimentos\\"+name;
					break;
				default:
						outputfile = FlexContext.getServletContext().getRealPath("\\images\\");
						//outputfile = "D:\\NOK\\images\\";
					break;
			}            
             
			
			
            FileOutputStream out = new FileOutputStream(outputfile);
            out.write(content);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

	}
	
	/**
	 * @param args
	 */
	 public static byte[] getFile(String fullName){
		 byte[] output = null;
		 File file = new File(fullName);
		 if(file.exists()){
			 output = new byte[(int)file.length()];
			 try{
				 FileInputStream fis = new FileInputStream(file);
				 fis.read(output);
				 fis.close();
			 }catch(IOException ex){
				 Logger.getLogger(FileUtils.class.getSimpleName()).log(Level.SEVERE, ex.getMessage());
			 }
		 }
		 	return output;
	}

}
