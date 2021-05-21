package application;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;

public class SampleController implements Initializable{

	@FXML
	private Label label1;
	@FXML
	private Button but1,but2;
	
	File file=null;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	public void onClick_but1(ActionEvent event){
		
		label1.setText("YO! YO!");
		FileChooser chooser = new FileChooser();
	    chooser.setTitle("Open File");
	    FileChooser.ExtensionFilter fileExtensions = new FileChooser.ExtensionFilter("Images", "*.jpg", "*.png", "*.bmp");
	    chooser.getExtensionFilters().add(fileExtensions);
	    file = chooser.showOpenDialog(but1.getScene().getWindow());
	    System.out.println(file);
	}
	
	public void onClick_but2(ActionEvent event){
		
		label1.setText("SAving!!");
		DirectoryChooser chooser = new DirectoryChooser();
	    chooser.setTitle("Save File");
	    File folder = chooser.showDialog(but2.getScene().getWindow());
	    File out=new File(folder+"\\"+file.getName());
	    try {
			Files.copy(file.toPath(),out.toPath(), StandardCopyOption.REPLACE_EXISTING);
			Runtime.getRuntime().exec("explorer.exe /select," + out);
			Parent second=FXMLLoader.load(getClass().getResource("Second.fxml"));
			but2.getScene().setRoot(second);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}

}
