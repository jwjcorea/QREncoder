import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;



public class Hello {

	/**
	 * @param args
	 * @throws WriterException WriterException
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws WriterException, FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		String text  ="ȫ�浿\n����ó:010-1234-7777\n�̰� �߿��� ���Դϴ�. �����ֽø� ����ϰڽ��ϴ�.";
		text = new String(text.getBytes("UTF-8"), "ISO-8859-1");
		QRCodeWriter qrw = new QRCodeWriter();
		BitMatrix bitMatrix = qrw.encode(text, BarcodeFormat.QR_CODE, 200, 200);
		
		MatrixToImageWriter.writeToStream(bitMatrix, "png", new FileOutputStream("d:\\qrcode.png"));
		
	}

}
