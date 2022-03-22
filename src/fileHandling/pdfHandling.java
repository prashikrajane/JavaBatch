package fileHandling;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class pdfHandling {
    public static void main(String[] args) throws FileNotFoundException {
        try{
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream("sample.pdf"));
            document.open();
            Paragraph paragraph = new Paragraph("This is right alignment text");
            paragraph.setAlignment(Element.ALIGN_LEFT);
            document.add(paragraph);
            System.out.println("PDF File create successfully");
        }catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
