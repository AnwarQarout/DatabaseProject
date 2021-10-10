import java.util.Date;

import java.util.Formatter;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Properties;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.converter.IntegerStringConverter;
public class Driver extends Application {

	public static void main(String[] args) {
		
		
		launch(args);
		

	}

	@Override
	public  void start(Stage AnwarsStage) throws Exception {
		
		Image image = new Image("file:pic1.jpg");
		ImageView imageView = new ImageView(image);
		 
		
		
		
		Button loginAsStudent = new Button("Log In As Student");
		loginAsStudent.setLayoutX(151.0);
		loginAsStudent.setLayoutY(56.0);
		loginAsStudent.setPrefHeight(109.0);
		loginAsStudent.setPrefWidth(461.0);
		
		loginAsStudent.setOnAction(j->{
			AnwarsStage.close();
			Label idLabel = new Label ("ID");
			idLabel.setLayoutX(6.0);
			idLabel.setLayoutY(70.0);
			idLabel.setPrefHeight(35.0);
			idLabel.setPrefWidth(42.0);
			
			Label nameLabel = new Label ("Name");
			nameLabel.setLayoutX(3.0);
			nameLabel.setLayoutY(127.0);
			nameLabel.setPrefHeight(17.0);
			nameLabel.setPrefWidth(49.0);
			
			Label PasswordLabel = new Label ("Password");
			PasswordLabel.setLayoutX(6.0);
			PasswordLabel.setLayoutY(172.0);
			PasswordLabel.setPrefHeight(17.0);
			PasswordLabel.setPrefWidth(66.0);
			
			TextField idTF = new TextField();
			idTF.setLayoutX(100);
			idTF.setLayoutY(75);
			
			TextField NameTF = new TextField();
			NameTF.setLayoutX(100);
			NameTF.setLayoutY(123);
			
			TextField PasswordTF = new TextField();
			PasswordTF.setLayoutX(100);
			PasswordTF.setLayoutY(168);
			
			Button signIn = new Button("Sign In");
			signIn.setLayoutX(482);
			signIn.setLayoutY(99);
			signIn.setPrefHeight(56);
			signIn.setPrefWidth(118);
			
			signIn.setOnAction(g->{
				AnwarsStage.close();
				AnwarsStage.setScene(MyScenes.scene4);
				AnwarsStage.show();
			});
			
			Button back = new Button("Back");
			back.setLayoutX(299);
			back.setLayoutY(99);
			back.setPrefHeight(56);
			back.setPrefWidth(118);
			
			back.setOnAction(h->{
				AnwarsStage.close();
				AnwarsStage.setScene(MyScenes.scene1);
				AnwarsStage.show();
			});
			
			Image computers = new Image("file:computers.jpg");
			ImageView computersIV = new ImageView(computers);
			computersIV.setFitHeight(296);
			computersIV.setFitWidth(704);
			computersIV.setLayoutX(27);
			computersIV.setLayoutY(273);
			
			
			
			Pane pane = new Pane();
			pane.getChildren().addAll(imageView,computersIV,back,signIn,idLabel,nameLabel,PasswordLabel,idTF,NameTF,PasswordTF);
			MyScenes.scene7=new Scene(pane,800,600);
			AnwarsStage.setScene(MyScenes.scene7);
			AnwarsStage.show();
			
			
		});
		
		
		
		
		Button loginAsTeacher = new Button("Log In As Teacher");
		loginAsTeacher.setLayoutX(149.0);
		loginAsTeacher.setLayoutY(204.0);
		loginAsTeacher.setPrefHeight(109.0);
		loginAsTeacher.setPrefWidth(461.0);
		
		loginAsTeacher.setOnAction(k->{
			AnwarsStage.close();
			Label idLabel = new Label ("ID");
			idLabel.setLayoutX(6.0);
			idLabel.setLayoutY(70.0);
			idLabel.setPrefHeight(35.0);
			idLabel.setPrefWidth(42.0);
			
			Label nameLabel = new Label ("Name");
			nameLabel.setLayoutX(3.0);
			nameLabel.setLayoutY(127.0);
			nameLabel.setPrefHeight(17.0);
			nameLabel.setPrefWidth(49.0);
			
			Label PasswordLabel = new Label ("Password");
			PasswordLabel.setLayoutX(6.0);
			PasswordLabel.setLayoutY(172.0);
			PasswordLabel.setPrefHeight(17.0);
			PasswordLabel.setPrefWidth(66.0);
			
			TextField idTF = new TextField();
			idTF.setLayoutX(100);
			idTF.setLayoutY(75);
			
			TextField NameTF = new TextField();
			NameTF.setLayoutX(100);
			NameTF.setLayoutY(123);
			
			TextField PasswordTF = new TextField();
			PasswordTF.setLayoutX(100);
			PasswordTF.setLayoutY(168);
			
			Button signIn = new Button("Sign In");
			signIn.setLayoutX(482);
			signIn.setLayoutY(99);
			signIn.setPrefHeight(56);
			signIn.setPrefWidth(118);
			
			Button back = new Button("Back");
			back.setLayoutX(299);
			back.setLayoutY(99);
			back.setPrefHeight(56);
			back.setPrefWidth(118);
			
			back.setOnAction(h->{
				AnwarsStage.close();
				AnwarsStage.setScene(MyScenes.scene1);
				AnwarsStage.show();
			});
			
			Image computers = new Image("file:computers.jpg");
			ImageView computersIV = new ImageView(computers);
			computersIV.setFitHeight(296);
			computersIV.setFitWidth(704);
			computersIV.setLayoutX(27);
			computersIV.setLayoutY(273);
			
			
			
			Pane pane = new Pane();
			pane.getChildren().addAll(imageView,computersIV,back,signIn,idLabel,nameLabel,PasswordLabel,idTF,NameTF,PasswordTF);
			MyScenes.scene8=new Scene(pane,800,600);
			AnwarsStage.setScene(MyScenes.scene8);
			AnwarsStage.show();
			
			
		});
		
		Button loginAsManager = new Button("Log In As Manager");
		loginAsManager.setLayoutX(146.0);
		loginAsManager.setLayoutY(357.0);
		loginAsManager.setPrefHeight(109.0);
		loginAsManager.setPrefWidth(461.0);
		loginAsManager.setFont(new Font("Candara",15));
		
		loginAsManager.setOnAction(ac ->{
			AnwarsStage.close();
			Label idLabel = new Label ("SSN");
			idLabel.setLayoutX(6.0);
			idLabel.setLayoutY(70.0);
			idLabel.setPrefHeight(35.0);
			idLabel.setPrefWidth(42.0);
			
			Label nameLabel = new Label ("Name");
			nameLabel.setLayoutX(3.0);
			nameLabel.setLayoutY(127.0);
			nameLabel.setPrefHeight(17.0);
			nameLabel.setPrefWidth(49.0);
			
			Label PasswordLabel = new Label ("Password");
			PasswordLabel.setLayoutX(6.0);
			PasswordLabel.setLayoutY(172.0);
			PasswordLabel.setPrefHeight(17.0);
			PasswordLabel.setPrefWidth(66.0);
			
			TextField idTF = new TextField();
			idTF.setLayoutX(100);
			idTF.setLayoutY(75);
			
			TextField NameTF = new TextField();
			NameTF.setLayoutX(100);
			NameTF.setLayoutY(123);
			
			TextField PasswordTF = new TextField();
			PasswordTF.setLayoutX(100);
			PasswordTF.setLayoutY(168);
			
			Button signIn = new Button("Sign In");
			signIn.setLayoutX(482);
			signIn.setLayoutY(99);
			signIn.setPrefHeight(56);
			signIn.setPrefWidth(118);
			
			Button back = new Button("Back");
			back.setLayoutX(299);
			back.setLayoutY(99);
			back.setPrefHeight(56);
			back.setPrefWidth(118);
			
			back.setOnAction(h->{
				AnwarsStage.close();
				AnwarsStage.setScene(MyScenes.scene1);
				AnwarsStage.show();
			});
			
			Image computers = new Image("file:computers.jpg");
			ImageView computersIV = new ImageView(computers);
			computersIV.setFitHeight(296);
			computersIV.setFitWidth(704);
			computersIV.setLayoutX(27);
			computersIV.setLayoutY(273);
			
			
			
			Pane pane = new Pane();
			pane.getChildren().addAll(imageView,computersIV,back,signIn,idLabel,nameLabel,PasswordLabel,idTF,NameTF,PasswordTF);
			MyScenes.scene9=new Scene(pane,800,600);
			AnwarsStage.setScene(MyScenes.scene9);
			AnwarsStage.show();
		});
		
		
		Button areYouNew = new Button("New Student? Sign Up Here!");
		areYouNew.setLayoutX(492.0);
		areYouNew.setLayoutY(514.0);
		areYouNew.setPrefHeight(58.0);
		areYouNew.setPrefWidth(233.0);
		/* "SIGN UP AS STUDENT" ACTIONS START HERE */
		areYouNew.setOnAction(e ->{
			
			AnwarsStage.close();
			
			Image welcomeToSofouf = new Image("file:WelcomeToSofouf.png");
			ImageView welcomeToSofoufIV = new ImageView(welcomeToSofouf);
			welcomeToSofoufIV.setFitHeight(63.0);
			welcomeToSofoufIV.setFitWidth(549.0);
			welcomeToSofoufIV.setLayoutX(116.0);
			welcomeToSofoufIV.setLayoutY(14.0);
			
			Image sofoufLogo = new Image("file:SofoufLogo.png");
			ImageView sofoufLogoIV = new ImageView(sofoufLogo);
			sofoufLogoIV.setFitHeight(292.0);
			sofoufLogoIV.setFitWidth(339.0);
			sofoufLogoIV.setLayoutX(326.0);
			sofoufLogoIV.setLayoutY(125.0);
			
			
			
			Label firstNameLabel = new Label();
			firstNameLabel.setText("First Name");
			firstNameLabel.setLayoutX(8.0);
			firstNameLabel.setLayoutY(100);
			firstNameLabel.setPrefHeight(38.0);
			firstNameLabel.setPrefWidth(63.0);
			
			TextField firstNameLabelTF = new TextField();
			firstNameLabelTF.setLayoutX(78.0);
			firstNameLabelTF.setLayoutY(107.0);
			
			Label lastNameLabel = new Label();
			lastNameLabel.setText("Last Name");
			lastNameLabel.setLayoutX(8.0);
			lastNameLabel.setLayoutY(150);
			lastNameLabel.setPrefHeight(38.0);
			lastNameLabel.setPrefWidth(63.0);
			
			TextField lastNameLabelTF = new TextField();
			lastNameLabelTF.setLayoutX(78.0);
			lastNameLabelTF.setLayoutY(156.0);
			
			Label passwordLabel = new Label();
			passwordLabel.setText("Password");
			passwordLabel.setLayoutX(8.0);
			passwordLabel.setLayoutY(199.0);
			passwordLabel.setPrefHeight(38.0);
			passwordLabel.setPrefWidth(63.0);
			
			TextField passwordLabelTF = new TextField();
			passwordLabelTF.setLayoutX(78.0);
			passwordLabelTF.setLayoutY(206.0);
			
			Label numberLabel = new Label();
			numberLabel.setText("Number");
			numberLabel.setLayoutX(8.0);
			numberLabel.setLayoutY(244.0);
			numberLabel.setPrefHeight(38.0);
			numberLabel.setPrefWidth(63.0);
			
			TextField numberLabelTF = new TextField();
			numberLabelTF.setLayoutX(78.0);
			numberLabelTF.setLayoutY(250.0);
			
			Label emailLabel = new Label();
			emailLabel.setText("Email");
			emailLabel.setLayoutX(8.0);
			emailLabel.setLayoutY(294.0);
			emailLabel.setPrefHeight(38.0);
			emailLabel.setPrefWidth(63.0);
			
			TextField emailLabelTF = new TextField();
			emailLabelTF.setLayoutX(78.0);
			emailLabelTF.setLayoutY(300.0);
			
			Label creditCardLabel = new Label();
			creditCardLabel.setText("Credit card");
			creditCardLabel.setLayoutX(8.0);
			creditCardLabel.setLayoutY(343.0);
			creditCardLabel.setPrefHeight(38.0);
			creditCardLabel.setPrefWidth(63.0);
			
			TextField creditCardLabelTF = new TextField();
			creditCardLabelTF.setLayoutX(78.0);
			creditCardLabelTF.setLayoutY(349.0);
			
			Label budgetLabel = new Label();
			budgetLabel.setText("Budget");
			budgetLabel.setLayoutX(8.0);
			budgetLabel.setLayoutY(392);
			budgetLabel.setPrefHeight(38.0);
			budgetLabel.setPrefWidth(63.0);
			
			TextField budgetLabelTF = new TextField();
			budgetLabelTF.setLayoutX(78.0);
			budgetLabelTF.setLayoutY(398.0);
			
			Label genderLabel = new Label();
			genderLabel.setText("Gender");
			genderLabel.setLayoutX(8.0);
			genderLabel.setLayoutY(451);
			genderLabel.setPrefHeight(38.0);
			genderLabel.setPrefWidth(63.0);
			
			ToggleGroup maleFemaleTG = new ToggleGroup();
			
			RadioButton maleRB = new RadioButton();
			maleRB.setLayoutX(78.0);
			maleRB.setLayoutY(462.0);
			maleRB.setText("Male");
			maleRB.setToggleGroup(maleFemaleTG);
			
			RadioButton femaleRB = new RadioButton();
			femaleRB.setLayoutX(152.0);
			femaleRB.setLayoutY(462.0);
			femaleRB.setText("Female");
			femaleRB.setToggleGroup(maleFemaleTG);
			
			Button backFromSignUp = new Button("Back");
			backFromSignUp.setLayoutX(20.0);
			backFromSignUp.setLayoutY(532.0);
			backFromSignUp.setPrefHeight(40.0);
			backFromSignUp.setPrefWidth(78.0);
			
			backFromSignUp.setOnAction(c -> {
				AnwarsStage.close();
				AnwarsStage.setScene(MyScenes.scene1);
				AnwarsStage.show(); 
			});
			
			
			
			Button signUpNowButton = new Button();
			signUpNowButton.setText("Sign Up Now!");
			signUpNowButton.setLayoutX(616.0);
			signUpNowButton.setLayoutY(517.0);
			signUpNowButton.setPrefHeight(50.0);
			signUpNowButton.setPrefWidth(119.0);
			
			/* "Sign up Now" button set on action */
			signUpNowButton.setOnAction( a-> {
				String password = passwordLabelTF.getText();
				String name = firstNameLabelTF.getText();
				String email = emailLabelTF.getText();
				int number = Integer.parseInt(numberLabelTF.getText());
				int budget = Integer.parseInt(budgetLabelTF.getText());
				Students student = new Students(password,name,number,email,budget);
				AllQueries.insertStudent(student);
				AnwarsStage.close();
				Button continueButton = new Button("Continue");
				continueButton.setLayoutX(609.0);
				continueButton.setLayoutY(513.0);
				continueButton.setPrefHeight(51.0);
				continueButton.setPrefWidth(135.0);
				/* Continue button after walkthrough actions start here */
				continueButton.setOnAction(b -> {
					AnwarsStage.close();
					Button takeAnExam = new Button("Take An Exam");
					takeAnExam.setLayoutX(66.0);
					takeAnExam.setLayoutY(109.0);
					takeAnExam.setPrefHeight(140.0);
					takeAnExam.setPrefWidth(408.0);
					takeAnExam.setStyle("-fx-background-color: #00ff00; ");
					
					takeAnExam.setOnAction(s->{
						
						AnwarsStage.close();
						
						
						ChoiceBox subjectChoiceBox = new ChoiceBox();
						subjectChoiceBox.getItems().add("Math");
						subjectChoiceBox.getItems().add("Arabic");
						subjectChoiceBox.getItems().add("English");
						subjectChoiceBox.getItems().add("Physics");
						subjectChoiceBox.setLayoutX(87.0);
						subjectChoiceBox.setLayoutY(53.0);
						subjectChoiceBox.setPrefWidth(150.0);
						
						Label subjectLabel = new Label("Subject");
						subjectLabel.setLayoutX(16.0);
						subjectLabel.setLayoutY(57.0);
						
						ToggleGroup typeTG = new ToggleGroup();
						
						RadioButton quizRB = new RadioButton("Quiz");
						quizRB.setLayoutX(87.0);
						quizRB.setLayoutY(128.0);
						quizRB.setToggleGroup(typeTG);
						
						RadioButton midtermRB = new RadioButton("Midterm");
						midtermRB.setLayoutX(207.0);
						midtermRB.setLayoutY(128.0);
						midtermRB.setToggleGroup(typeTG);
						
						RadioButton finalRB = new RadioButton("Final");
						finalRB.setLayoutX(337.0);
						finalRB.setLayoutY(128.0);
						finalRB.setToggleGroup(typeTG);
						
						Label typeLabel = new Label("Type");
						typeLabel.setLayoutX(14.0);
						typeLabel.setLayoutY(128.0);
						
						Label howMuchCost = new Label();
						howMuchCost.setLayoutX(25.0);
						howMuchCost.setLayoutY(199.0);
						howMuchCost.setPrefHeight(56.0);
						howMuchCost.setPrefWidth(252.0);
						
						Image takeExam = new Image("file:takeExam.gif");
						ImageView takeExamIV = new ImageView(takeExam);
						takeExamIV.setFitHeight(248.0);
						takeExamIV.setFitWidth(400.0);
						takeExamIV.setLayoutX(51.0);
						takeExamIV.setLayoutY(313.0);
						
						Button startExam = new Button("Start Exam.");
						startExam.setLayoutX(614.0);
						startExam.setLayoutY(486.0);
						startExam.setPrefHeight(56.0);
						startExam.setPrefWidth(118.0);
						
						Button backToSelect = new Button("Back");
						backToSelect.setLayoutX(465.0);
						backToSelect.setLayoutY(486.0);
						backToSelect.setPrefHeight(56.0);
						backToSelect.setPrefWidth(118.0);
						
						backToSelect.setOnAction(d->{
							AnwarsStage.close();
							AnwarsStage.setScene(MyScenes.scene4);
							AnwarsStage.show();
						});
						
						
						if(quizRB.isSelected()) {
							howMuchCost.setText("This will cost you 3$, and it has 5 questions.");
						}
						else if(midtermRB.isSelected()) {
							howMuchCost.setText("This will cost you 6$, and it has 10 questions.");
						}
						else if(finalRB.isSelected()) {
							howMuchCost.setText("This will cost you 10$, and it has 15 questions");
						}
						Pane pane = new Pane();
						pane.getChildren().addAll(imageView,takeExamIV,startExam,subjectChoiceBox,backToSelect,subjectLabel,typeLabel,howMuchCost,quizRB,midtermRB,finalRB);
						MyScenes.scene5=new Scene(pane,800,600);
						AnwarsStage.setScene(MyScenes.scene5);
						AnwarsStage.show();
						
						
						
						
						
					});
					
					Image takeAnExamPic = new Image("file:TakeAnExam.png");
					ImageView takeAnExamIV = new ImageView(takeAnExamPic);
					takeAnExamIV.setFitHeight(140.0);
					takeAnExamIV.setFitWidth(200.0);
					takeAnExamIV.setLayoutX(527.0);
					takeAnExamIV.setLayoutY(109.0);
					
					
					Button viewPersonalInfo = new Button("View My Personal Info");
					viewPersonalInfo.setLayoutX(66.0);
					viewPersonalInfo.setLayoutY(284.0);
					viewPersonalInfo.setPrefHeight(140.0);
					viewPersonalInfo.setPrefWidth(408.0);
					viewPersonalInfo.setStyle("-fx-background-color: #ff0000; ");
					
					viewPersonalInfo.setOnAction(f->{
						AnwarsStage.close();
						Label idLabel = new Label ("ID");
						idLabel.setLayoutX(6.0);
						idLabel.setLayoutY(70.0);
						idLabel.setPrefHeight(35.0);
						idLabel.setPrefWidth(42.0);
						
						Label nameLabel = new Label ("Name");
						nameLabel.setLayoutX(3.0);
						nameLabel.setLayoutY(127.0);
						nameLabel.setPrefHeight(17.0);
						nameLabel.setPrefWidth(49.0);
						
						Label PasswordLabel = new Label ("Password");
						PasswordLabel.setLayoutX(6.0);
						PasswordLabel.setLayoutY(172.0);
						PasswordLabel.setPrefHeight(17.0);
						PasswordLabel.setPrefWidth(66.0);
						
						Label BudgetLabel = new Label ("Budget");
						BudgetLabel.setLayoutX(8.0);
						BudgetLabel.setLayoutY(223.0);
						
						
						Label addBudgetLabel = new Label ("Add Budget");
						addBudgetLabel.setLayoutX(8.0);
						addBudgetLabel.setLayoutY(283.0);
						addBudgetLabel.setPrefHeight(17.0);
						addBudgetLabel.setPrefWidth(72.0);
						
						TextField idTF = new TextField();
						idTF.setLayoutX(100);
						idTF.setLayoutY(75);
						
						TextField NameTF = new TextField();
						NameTF.setLayoutX(100);
						NameTF.setLayoutY(123);
						
						TextField PasswordTF = new TextField();
						PasswordTF.setLayoutX(100);
						PasswordTF.setLayoutY(168);
						
						TextField BudgetTF = new TextField();
						BudgetTF.setLayoutX(100);
						BudgetTF.setLayoutY(219);
						
						TextField AddBudgetTF = new TextField();
						AddBudgetTF.setLayoutX(100);
						AddBudgetTF.setLayoutY(279);
						
						Button signOutToChooseMenu = new Button("Sign out");
						signOutToChooseMenu.setLayoutX(614);
						signOutToChooseMenu.setLayoutY(486);
						signOutToChooseMenu.setPrefHeight(56);
						signOutToChooseMenu.setPrefWidth(118);
						
						signOutToChooseMenu.setOnAction(g->{
							AnwarsStage.close();
							AnwarsStage.setScene(MyScenes.scene1);
							AnwarsStage.show();
						});
						
						Button backToChooseMenu = new Button("Back");
						backToChooseMenu.setLayoutX(465);
						backToChooseMenu.setLayoutY(486);
						backToChooseMenu.setPrefHeight(56);
						backToChooseMenu.setPrefWidth(118);
						
						backToChooseMenu.setOnAction(h->{
							AnwarsStage.close();
							AnwarsStage.setScene(MyScenes.scene4);
							AnwarsStage.show();
						});
						
						Image computersPic = new Image("file:computers.jpg");
						ImageView computersPicIV = new ImageView(computersPic);
						computersPicIV.setFitHeight(248);
						computersPicIV.setFitWidth(400);
						computersPicIV.setLayoutX(27);
						computersPicIV.setLayoutY(321);
						
						Pane pane = new Pane();
						pane.getChildren().addAll(imageView,computersPicIV,backToChooseMenu,signOutToChooseMenu,idTF,NameTF,PasswordTF,BudgetTF,AddBudgetTF,idLabel,nameLabel,PasswordLabel,BudgetLabel,addBudgetLabel);
						MyScenes.scene6=new Scene(pane,800,600);
						AnwarsStage.setScene(MyScenes.scene6);
						AnwarsStage.show();
			
						
						
						
						
						
					});
					
					Image viewPersonalInfoPic = new Image("file:PersonalInfo.png");
					ImageView viewPersonalInfoIV = new ImageView(viewPersonalInfoPic);
					viewPersonalInfoIV.setFitHeight(140.0);
					viewPersonalInfoIV.setFitWidth(200.0);
					viewPersonalInfoIV.setLayoutX(533.0);
					viewPersonalInfoIV.setLayoutY(284.0);
					
					Button signOutAfterWalkthrough = new Button("Sign out");
					signOutAfterWalkthrough.setLayoutX(337.0);
					signOutAfterWalkthrough.setLayoutY(525.0);
					signOutAfterWalkthrough.setPrefHeight(47.0);
					signOutAfterWalkthrough.setPrefWidth(137.0);
					signOutAfterWalkthrough.setOnAction(z->{
						AnwarsStage.close();
						AnwarsStage.setScene(MyScenes.scene1);
						AnwarsStage.show();
					});
					
					
					Pane pane = new Pane();
					pane.getChildren().addAll(imageView,viewPersonalInfoIV,takeAnExamIV,takeAnExam,viewPersonalInfo,signOutAfterWalkthrough);
					MyScenes.scene4 = new Scene(pane,800,600);
					AnwarsStage.setScene(MyScenes.scene4);
					AnwarsStage.show();
					
					
				});
				/*Continue button ends here */
				Image SaeedsBackground = new Image("file:SaeedsBackground.png");
				ImageView SaeedsBackgroundIV = new ImageView(SaeedsBackground);
				Pane pane = new Pane();
				pane.getChildren().addAll(SaeedsBackgroundIV,continueButton);
				MyScenes.scene3 = new Scene(pane,800,600);
				AnwarsStage.setScene(MyScenes.scene3);
				AnwarsStage.show();
			});
			/* "Sign up now" button action ends here */
			
			
			
			
			Pane pane = new Pane();
			pane.getChildren().addAll(imageView,sofoufLogoIV,welcomeToSofoufIV,signUpNowButton,backFromSignUp,femaleRB,maleRB,passwordLabelTF,creditCardLabelTF,emailLabelTF,numberLabelTF,lastNameLabelTF,budgetLabelTF,firstNameLabelTF,firstNameLabel,lastNameLabel,passwordLabel,numberLabel,emailLabel,creditCardLabel,budgetLabel,genderLabel);
			
			MyScenes.scene2 = new Scene(pane,800,600);
			AnwarsStage.setScene(MyScenes.scene2);
			AnwarsStage.show();
			
			
			
		});
		/* "Sign up as student" set on action ends here */
		Pane pane = new Pane();
		pane.getChildren().addAll(imageView,loginAsStudent,loginAsTeacher,loginAsManager,areYouNew);
		MyScenes.scene1 =new Scene(pane,800,600);
		AnwarsStage.setScene(MyScenes.scene1);
		AnwarsStage.show();
		
		
		
		
		
		
	}

}
