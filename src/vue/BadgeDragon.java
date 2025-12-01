package vue;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class BadgeDragon extends AnchorPane {

	public BadgeDragon() {
		//AnchorPane blason = new AnchorPane();
		this.setPrefHeight(200);
		this.setPrefWidth(166);
		this.setStyle("-fx-background-color: red");
		
		/*
		ImageView formeBlason = new ImageView();
		formeBlason.setImage(new Image("vue/badge/armoirie.png"));
		this.getChildren().add(formeBlason);*/
		
		/*ImageView dragonEastern = new ImageView();
		dragonEastern.setImage(new Image("vue/badge/dragonEastern.png"));
		dragonEastern.setLayoutX(100);
		dragonEastern.setLayoutY(110);
		dragonEastern.setScaleX(-1.5);
		dragonEastern.setScaleY(1.5);
		this.getChildren().add(dragonEastern);*/
		
		/*ImageView dragonWestern = new ImageView();
		dragonWestern.setImage(new Image("vue/badge/dragonWestern.png"));
		dragonWestern.setLayoutX(100);
		dragonWestern.setLayoutY(110);
		dragonWestern.setScaleX(-1.5);
		dragonWestern.setScaleY(1.5);
		this.getChildren().add(dragonWestern);*/
		
		
		/*ImageView dancingPeople = new ImageView();
		dancingPeople.setImage(new Image("vue/badge/dancingPeople.png"));
		dancingPeople.setLayoutX(120);
		dancingPeople.setLayoutY(230);
		dancingPeople.setScaleX(-1.5);
		dancingPeople.setScaleY(1.5);
		this.getChildren().add(dancingPeople);*/
	}
	
	public BadgeDragon ecusson() {
		ImageView formeBlason = new ImageView();
		formeBlason.setImage(new Image("vue/badge/armoirie.png"));
		this.getChildren().add(formeBlason);
		return this;
	}
	
	public BadgeDragon bouclierRond() {
		ImageView formeBlason = new ImageView();
		formeBlason.setImage(new Image("vue/badge/armoirie-ronde.png"));
		this.getChildren().add(formeBlason);
		return this;
	}
	
	public BadgeDragon dragonEasternAuCentre() {
		ImageView dragonEastern = new ImageView();
		dragonEastern.setImage(new Image("vue/badge/dragonEastern.png"));
		dragonEastern.setLayoutX(100);
		dragonEastern.setLayoutY(110);
		dragonEastern.setScaleX(-1.5);
		dragonEastern.setScaleY(1.5);
		this.getChildren().add(dragonEastern);
		return this;
	}
	
	public BadgeDragon dragonWesternAuCentre() {
		ImageView dragonWestern = new ImageView();
		dragonWestern.setImage(new Image("vue/badge/dragonWestern.png"));
		dragonWestern.setLayoutX(100);
		dragonWestern.setLayoutY(110);
		dragonWestern.setScaleX(-1.5);
		dragonWestern.setScaleY(1.5);
		this.getChildren().add(dragonWestern);
		return this;
	}
	
	public BadgeDragon danceursEnBas() {
		ImageView dancingPeople = new ImageView();
		dancingPeople.setImage(new Image("vue/badge/dancingPeople.png"));
		dancingPeople.setLayoutX(120);
		dancingPeople.setLayoutY(230);
		dancingPeople.setScaleX(-1.5);
		dancingPeople.setScaleY(1.5);
		this.getChildren().add(dancingPeople);
		return this;
	}
	
}
