/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polgame;

import java.io.File;
import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author komp
 */
public class Polgame extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        
        Circle s1 = new Circle(190, 282, 8);
        Circle s2 = new Circle(193, 261, 8);
        Circle s3 = new Circle(200, 244, 8);
        Circle s4 = new Circle(208, 228, 8);
        Circle s5 = new Circle(222, 211, 8);
        Circle s6 = new Circle(238, 199, 8);
        Circle s7 = new Circle(255, 188, 8);
        Circle s8 = new Circle(274, 182, 8);
        Circle s9 = new Circle(293, 179, 8);
        Circle s10 = new Circle(312, 179, 8);
        Circle s11 = new Circle(331, 181, 8);
        Circle s12 = new Circle(351, 189, 8);
        Circle s13 = new Circle(367, 199, 8);
        Circle s14 = new Circle(383, 210, 8);
        Circle s15 = new Circle(396, 229, 8);
        Circle s16 = new Circle(404, 244, 8);
        Circle s17 = new Circle(412, 261, 8);
        Circle s18 = new Circle(415, 282, 8);
        Circle[] prvired = new Circle[18];
        prvired[0 ] = s1;
        prvired[1 ] = s2;
        prvired[2 ] = s3;
        prvired[3 ] = s4;
        prvired[4 ] = s5;
        prvired[5 ] = s6;
        prvired[6 ] = s7;
        prvired[7 ] = s8;
        prvired[8 ] = s9;
        prvired[9] = s10;
        prvired[10] = s11;
        prvired[11] = s12;
        prvired[12] = s13;
        prvired[13] = s14;
        prvired[14] = s15;
        prvired[15] = s16;
	prvired[16] = s17;
        prvired[17] = s18;
       
		
        Circle s19 = new Circle(172, 283, 8);
        Circle s20 = new Circle(175, 262, 8);
        Circle s21 = new Circle(182, 241, 8);
        Circle s22 = new Circle(192, 222, 8);
        Circle s23 = new Circle(205, 204, 8);
        Circle s24 = new Circle(222, 189, 8);
        Circle s25 = new Circle(239, 179, 8);
        Circle s26 = new Circle(255, 170, 8);
        Circle s27 = new Circle(273, 164, 8);
        Circle s28 = new Circle(293, 161, 8);
        Circle s29 = new Circle(312, 160, 8);
        Circle s30 = new Circle(332, 164, 8);
        Circle s31 = new Circle(350, 169, 8);
        Circle s32 = new Circle(368, 179, 8);
        Circle s33 = new Circle(384, 189, 8);
        Circle s34 = new Circle(400, 204, 8);
        Circle s35 = new Circle(412, 221, 8);
        Circle s36 = new Circle(423, 240, 8);
        Circle s37 = new Circle(431, 261, 8);
        Circle s38 = new Circle(434, 281, 8);
        Circle[] drugired = new Circle[20];
	drugired[0] = s19;
        drugired[1] = s20;
        drugired[2] = s21;
        drugired[3] = s22;
        drugired[4] = s23;
        drugired[5] = s24;
        drugired[6] = s25;
	drugired[7] = s26;
        drugired[8] = s27;
	drugired[9] = s28;
        drugired[10] = s29;
        drugired[11] = s30;
        drugired[12] = s31;
        drugired[13] = s32;
        drugired[14] = s33;
        drugired[15] = s34;
	drugired[16] = s35;
        drugired[17] = s36;
	drugired[18] = s37;
        drugired[19] = s38;
		
        Circle s39 = new Circle(152, 281, 8);
        Circle s40 = new Circle(156, 261, 8);
        Circle s41 = new Circle(162, 240, 8);
        Circle s42 = new Circle(172, 220, 8);
        Circle s43 = new Circle(182, 201, 8);
        Circle s44 = new Circle(197, 186, 8);
        Circle s45 = new Circle(215, 170, 8);
        Circle s46 = new Circle(232, 159, 8);
        Circle s47 = new Circle(252, 150, 8);
        Circle s48 = new Circle(272, 143, 8);
        Circle s49 = new Circle(292, 143, 8);
        Circle s50 = new Circle(312, 142, 8);
        Circle s51 = new Circle(334, 143, 8);
        Circle s52 = new Circle(354, 150, 8);
        Circle s53 = new Circle(373, 160, 8);
        Circle s54 = new Circle(391, 172, 8);
        Circle s55 = new Circle(407, 185, 8);
        Circle s56 = new Circle(422, 201, 8);
        Circle s57 = new Circle(433, 219, 8);
        Circle s58 = new Circle(444, 241, 8);
        Circle s59 = new Circle(449, 261, 8);
        Circle s60 = new Circle(452, 282, 8);
        Circle[] trecired = new Circle[22];
	trecired[0] = s39;
        trecired[1] = s40;
        trecired[2] = s41;
        trecired[3] = s42;
        trecired[4] = s43;
        trecired[5] = s44;
        trecired[6] = s45;
	trecired[7] = s46;
        trecired[8] = s47;
	trecired[9] = s48;
        trecired[10] = s49;
        trecired[11] = s50;
        trecired[12] = s51;
        trecired[13] = s52;
        trecired[14] = s53;
        trecired[15] = s54;
	trecired[16] = s55;
        trecired[17] = s56;
	trecired[18] = s57;
        trecired[19] = s58;
        trecired[20] = s59;
        trecired[21] = s60;
		
        Circle s61 = new Circle(135, 281, 8);
        Circle s62 = new Circle(136, 261, 8);
        Circle s63 = new Circle(143, 237, 8);
        Circle s64 = new Circle(152, 217, 8);
        Circle s65 = new Circle(163, 199, 8);
        Circle s66 = new Circle(175, 181, 8);
        Circle s67 = new Circle(190, 167, 8);
        Circle s68 = new Circle(206, 153, 8);
        Circle s69 = new Circle(224, 142, 8);
        Circle s70 = new Circle(247, 132, 8);
        Circle s71 = new Circle(270, 124, 8);
        Circle s72 = new Circle(292, 123, 8);
        Circle s73 = new Circle(313, 123, 8);
        Circle s74 = new Circle(336, 124, 8);
        Circle s75 = new Circle(357, 132, 8);
        Circle s76 = new Circle(381, 141, 8);
        Circle s77 = new Circle(399, 153, 8);
        Circle s78 = new Circle(417, 167, 8);
        Circle s79 = new Circle(430, 182, 8);
        Circle s80 = new Circle(444, 198, 8);
        Circle s81 = new Circle(453, 216, 8);
        Circle s82 = new Circle(463, 238, 8);
        Circle s83 = new Circle(469, 260, 8);
        Circle s84 = new Circle(471, 282, 8);
        Circle[] cetvrtired = new Circle[24];
	cetvrtired[0] = s61;
        cetvrtired[1] = s62;
        cetvrtired[2] = s63;
        cetvrtired[3] = s64;
        cetvrtired[4] = s65;
        cetvrtired[5] = s66;
        cetvrtired[6] = s67;
	cetvrtired[7] = s68;
        cetvrtired[8] = s69;
	cetvrtired[9] = s70;
        cetvrtired[10] = s71;
        cetvrtired[11] = s72;
        cetvrtired[12] = s73;
        cetvrtired[13] = s74;
        cetvrtired[14] = s75;
        cetvrtired[15] = s76;
	cetvrtired[16] = s77;
        cetvrtired[17] = s78;
	cetvrtired[18] = s79;
	cetvrtired[19] = s80;
	cetvrtired[20] = s81;
        cetvrtired[21] = s82;
        cetvrtired[22] = s83;
        cetvrtired[23] = s84;
		
		
        Circle s85 = new Circle(115, 281, 8);
        Circle s86 = new Circle(118, 259, 8);
        Circle s87 = new Circle(125, 236, 8);
        Circle s88 = new Circle(133, 210, 8);
        Circle s89 = new Circle(146, 190, 8);
        Circle s90 = new Circle(158, 173, 8);
        Circle s91 = new Circle(172, 158, 8);
        Circle s92 = new Circle(190, 141, 8);
        Circle s93 = new Circle(209, 130, 8);
        Circle s94 = new Circle(229, 120, 8);
        Circle s95 = new Circle(250, 110, 8);
        Circle s96 = new Circle(269, 106, 8);
        Circle s97 = new Circle(292, 105, 8);
        Circle s98 = new Circle(312, 105, 8);
        Circle s99 = new Circle(334, 105, 8);
        Circle s100 = new Circle(356, 111, 8);
        Circle s101 = new Circle(375, 119, 8);
        Circle s102 = new Circle(397, 130, 8);
        Circle s103 = new Circle(415, 141, 8);
        Circle s104 = new Circle(433, 158, 8);
        Circle s105 = new Circle(448, 174, 8);
        Circle s106 = new Circle(461, 191, 8);
        Circle s107 = new Circle(472, 211, 8);
        Circle s108 = new Circle(481, 235, 8);
        Circle s109 = new Circle(488, 259, 8);
        Circle s110 = new Circle(490, 282, 8);
        Circle[] petired = new Circle[26];
	petired[0] = s85;
        petired[1] = s86;
        petired[2] = s87;
        petired[3] = s88;
        petired[4] = s89;
        petired[5] = s90;
        petired[6] = s91;
        petired[7] = s92;
        petired[8] = s93;
	petired[9] = s94;
        petired[10] = s95;
	petired[11] = s96;
        petired[12] = s97;
        petired[13] = s98;
        petired[14] = s99;
        petired[15] = s100;
        petired[16] = s101;
	petired[17] = s102;
        petired[18] = s103;
	petired[19] = s104;
	petired[20] = s105;
	petired[21] = s106;
        petired[22] = s107;
        petired[23] = s108;
        petired[24] = s109;
	petired[25] = s110;
		
        Circle s111 = new Circle(97, 283, 8);
        Circle s112 = new Circle(99, 259, 8);
        Circle s113 = new Circle(105, 232, 8);
        Circle s114 = new Circle(115, 206, 8);
        Circle s115 = new Circle(128, 184, 8);
        Circle s116 = new Circle(140, 164, 8);
        Circle s117 = new Circle(156, 148, 8);
        Circle s118 = new Circle(170, 134, 8);
        Circle s119 = new Circle(186, 122, 8);
        Circle s120 = new Circle(206, 109, 8);
        Circle s121 = new Circle(226, 99.0, 8);
        Circle s122 = new Circle(247, 90.0, 8);
        Circle s123 = new Circle(268, 87.0, 8);
        Circle s124 = new Circle(292, 86.0, 8);
        Circle s125 = new Circle(312, 85.0, 8);
        Circle s126 = new Circle(338, 86.0, 8);
        Circle s127 = new Circle(358, 92.0, 8);
        Circle s128 = new Circle(380, 100, 8);
        Circle s129 = new Circle(401, 109, 8);
        Circle s130 = new Circle(418, 122, 8);
        Circle s131 = new Circle(435, 133, 8);
        Circle s132 = new Circle(451, 149, 8);
        Circle s133 = new Circle(465, 165, 8);
        Circle s134 = new Circle(478, 183, 8);
        Circle s135 = new Circle(490, 206, 8);
        Circle s136 = new Circle(501, 231, 8);
        Circle s137 = new Circle(507, 259, 8);
        Circle s138 = new Circle(509, 281, 8);
        Circle[] sestired = new Circle[28];
	sestired[0] = s111;
        sestired[1] = s112;
	sestired[2] = s113;
        sestired[3] = s114;
	sestired[4] = s115;
	sestired[5] = s116;
	sestired[6] = s117;
        sestired[7] = s118;
        sestired[8] = s119;
        sestired[9] = s120;
	sestired[10] = s121;
	sestired[11] = s122;
        sestired[12] = s123;
	sestired[13] = s124;
	sestired[14] = s125;
        sestired[15] = s126;
	sestired[16] = s127;
        sestired[17] = s128;
	sestired[18] = s129;
	sestired[19] = s130;
	sestired[20] = s131;
        sestired[21] = s132;
        sestired[22] = s133;
        sestired[23] = s134;
	sestired[24] = s135;
	sestired[25] = s136;
        sestired[26] = s137;
	sestired[27] = s138;
		
		
        Circle s139 = new Circle(78, 282, 8);
        Circle s140 = new Circle(81, 256, 8);
        Circle s141 = new Circle(86, 229, 8);
        Circle s142 = new Circle(96, 204, 8);
        Circle s143 = new Circle(108, 179, 8);
        Circle s144 = new Circle(120, 159, 8);
        Circle s145 = new Circle(135, 140, 8);
        Circle s146 = new Circle(152, 122, 8);
        Circle s147 = new Circle(170, 109, 8);
        Circle s148 = new Circle(189, 94.0, 8);
        Circle s149 = new Circle(210, 84.0, 8);
        Circle s150 = new Circle(229, 77.0, 8);
        Circle s151 = new Circle(250, 70.0, 8);
        Circle s152 = new Circle(270, 67.0, 8);
        Circle s153 = new Circle(292, 65.0, 8);
        Circle s154 = new Circle(312, 66.0, 8);
        Circle s155 = new Circle(335, 66.0, 8);
        Circle s156 = new Circle(354, 71.0, 8);
        Circle s157 = new Circle(376, 78.0, 8);
        Circle s158 = new Circle(395, 86.0, 8);
        Circle s159 = new Circle(416, 96.0, 8);
        Circle s160 = new Circle(434, 109, 8);
        Circle s161 = new Circle(453, 123, 8);
        Circle s162 = new Circle(470, 139, 8);
        Circle s163 = new Circle(485, 159, 8);
        Circle s164 = new Circle(498, 180, 8);
        Circle s165 = new Circle(510, 203, 8);
        Circle s166 = new Circle(521, 229, 8);
        Circle s167 = new Circle(525, 255, 8);
        Circle s168 = new Circle(528, 282, 8);
        Circle[] sedmired = new Circle[30];
	sedmired[0] = s139;
        sedmired[1] = s140;
	sedmired[2] = s141;
        sedmired[3] = s142;
	sedmired[4] = s143;
	sedmired[5] = s144;
	sedmired[6] = s145;
        sedmired[7] = s146;
        sedmired[8] = s147;
        sedmired[9] = s148;
	sedmired[10] = s149;
	sedmired[11] = s150;
        sedmired[12] = s151;
	sedmired[13] = s152;
	sedmired[14] = s153;
        sedmired[15] = s154;
	sedmired[16] = s155;
        sedmired[17] = s156;
	sedmired[18] = s157;
	sedmired[19] = s158;
	sedmired[20] = s159;
        sedmired[21] = s160;
        sedmired[22] = s161;
        sedmired[23] = s162;
	sedmired[24] = s163;
	sedmired[25] = s164;
        sedmired[26] = s165;
	sedmired[27] = s166;
	sedmired[28] = s167;
	sedmired[29] = s168;
		
        Circle s169 = new Circle(59, 282, 8);
        Circle s170 = new Circle(60, 255, 8);
        Circle s171 = new Circle(67, 227, 8);
        Circle s172 = new Circle(75, 201, 8);
        Circle s173 = new Circle(89, 173, 8);
        Circle s174 = new Circle(102, 150, 8);
        Circle s175 = new Circle(117, 130, 8);
        Circle s176 = new Circle(134, 112, 8);
        Circle s177 = new Circle(151, 95.0, 8);
        Circle s178 = new Circle(170, 83.0, 8);
        Circle s179 = new Circle(190, 71.0, 8);
        Circle s180 = new Circle(210, 62.0, 8);
        Circle s181 = new Circle(230, 57.0, 8);
        Circle s182 = new Circle(249, 50.0, 8);
        Circle s183 = new Circle(271, 48.0, 8);
        Circle s184 = new Circle(292, 45.0, 8);
        Circle s185 = new Circle(312, 45.0, 8);
        Circle s186 = new Circle(334, 48.0, 8);
        Circle s187 = new Circle(356, 50.0, 8);
        Circle s188 = new Circle(374, 57.0, 8);
        Circle s189 = new Circle(396, 63, 8);
        Circle s190 = new Circle(416, 71, 8);
        Circle s191 = new Circle(434, 83, 8);
        Circle s192 = new Circle(454, 97, 8);
        Circle s193 = new Circle(470, 112, 8);
        Circle s194 = new Circle(488, 130, 8);
        Circle s195 = new Circle(502, 149, 8);
        Circle s196 = new Circle(517, 173, 8);
        Circle s197 = new Circle(530, 201, 8);
        Circle s198 = new Circle(540, 227, 8);
        Circle s199 = new Circle(546, 255, 8);
        Circle s200 = new Circle(547, 283, 8);
        Circle[] osmired = new Circle[32];
	osmired[0] = s169;
        osmired[1] = s170;
	osmired[2] = s171;
        osmired[3] = s172;
	osmired[4] = s173;
	osmired[5] = s174;
	osmired[6] = s175;
        osmired[7] = s176;
        osmired[8] = s177;
        osmired[9] = s178;
	osmired[10] = s179;
	osmired[11] = s180;
        osmired[12] = s181;
	osmired[13] = s182;
	osmired[14] = s183;
        osmired[15] = s184;
        osmired[16] = s185;
        osmired[17] = s186;
	osmired[18] = s187;
	osmired[19] = s188;
	osmired[20] = s189;
        osmired[21] = s190;
        osmired[22] = s191;
        osmired[23] = s192;
	osmired[24] = s193;
	osmired[25] = s194;
        osmired[26] = s195;
	osmired[27] = s196;
	osmired[28] = s197;
	osmired[29] = s198;
        osmired[30] = s199;
        osmired[31] = s200;
        
        Circle[][] redredova = new Circle[8][];
        redredova[0] = prvired;
        redredova[1] = drugired;
        redredova[2] = trecired;
        redredova[3] = cetvrtired;
        redredova[4] = petired;
        redredova[5] = sestired;
        redredova[6] = sedmired;
        redredova[7] = osmired;
        
        
        
        Button btn = new Button();
        btn.setText("ELECTIONS");
        btn.setOnAction(e -> {
                party Communist = new party("CP", "com", 5.5, "#4e0a16");
                party Socialist = new party("SP", "soc", 6.1, "#d10844");
                party SocialDemocrat = new party("SDP", "sde", 36.3, "#ff82cf");
                party LiberalDemocrat = new party("LDP", "lde", 4.7, "#eaf455");
                party Conservative = new party("Tory", "con", 27.8, "#2b20f9");
                party Reactionary = new party("UKIP", "rea", 4.8, "#060247");
                party Fascist = new party("Fascist", "fas", 0, "#030219");
                party NationalSocialist = new party("NSP", "naz", 6.3, "#8B4513");
                
                party[] partys = new party[8];
                partys[0] = Communist;
                partys[1] = Socialist;
                partys[2] = SocialDemocrat;
                partys[3] = LiberalDemocrat;
                partys[4] = Conservative;
                partys[5] = Reactionary;
                partys[6] = Fascist;
                partys[7] = NationalSocialist;
                
                for(int j = 0; j < 8; j++){
                    int cs = (int) Math.round (partys[0].getVotewon()*(0.18 + 0.02*j));
                    for(int m = 0; m < cs; m++){
                            redredova[j][m].setFill(Paint.valueOf(partys[0].getColour()));
                        }
                    int ss = (int) Math.round (partys[1].getVotewon()*(0.18 + 0.02*j));
                    for(int m = 0; m < ss; m++){
                            redredova[j][cs+m].setFill(Paint.valueOf(partys[1].getColour()));
                        }
                    
                    int sds = (int) Math.round (partys[2].getVotewon()*(0.18 + 0.02*j));
                    for(int m = 0; m < sds; m++){
                            redredova[j][cs+ss+m].setFill(Paint.valueOf(partys[2].getColour()));
                        }
                    
                    int lds = (int) Math.round (partys[3].getVotewon()*(0.18 + 0.02*j));
                    for(int m = 0; m < lds; m++){
                            redredova[j][cs+ss+sds+m].setFill(Paint.valueOf(partys[3].getColour()));
                        }
 
                    int ts = (int) Math.round (partys[4].getVotewon()*(0.18 + 0.02*j));
                    for(int m = 0; m < ts; m++){
                            redredova[j][cs+ss+sds+lds+m].setFill(Paint.valueOf(partys[4].getColour()));
                        }

                    int ns = (int) Math.round (partys[7].getVotewon()*(0.18 + 0.02*j));
                    for(int m = 0; m < ns; m++){
                            redredova[j][18+j*2-1-m].setFill(Paint.valueOf(partys[7].getColour()));
                        }
                    int fs = (int) Math.round (partys[6].getVotewon()*(0.18 + 0.02*j));
                    for(int m = 0; m < fs; m++){
                            redredova[j][18+j*2-ns-1-m].setFill(Paint.valueOf(partys[6].getColour()));
                        }
                    int rs = (int) Math.round (partys[5].getVotewon()*(0.18 + 0.02*j));
                    for(int m = 0; m < rs; m++){
                            redredova[j][18+j*2-ns-fs-1-m].setFill(Paint.valueOf(partys[5].getColour()));
                        }
                }
        });

        
        AnchorPane root = new AnchorPane();
        for (int i = 0; i<redredova.length; i++){
            for (int j = 0; j<redredova[i].length; j++){
                root.getChildren().add(redredova[i][j]);
            }
        }
        root.getChildren().add(btn);
                
        StackPane rootpick = new StackPane();
        VBox vb1 = new VBox();
        HBox hb1 = new HBox(20);
        HBox hb2 = new HBox();
        Label pickyourparty = new Label("Pick Your Party");
        vb1.getChildren().addAll(hb1, hb2);
        hb2.getChildren().addAll(pickyourparty);
        
        Scene gamescene = new Scene(root, 900, 750);
        Scene pickpartyscene = new Scene(rootpick, 1500, 400);
        gamescene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        //pickpartyscene.getStylesheets().add("C:\\Users\\komp\\Documents\\NetBeansProjects\\polgame\\src\\polgame\\stylepick.css");       
        pickpartyscene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(pickpartyscene);
        primaryStage.show();

        
        Button bcom = new Button();
        bcom.setText("Communist");
        bcom.setOnAction(e -> {
            primaryStage.setScene(gamescene);
        });
        Button bsoc = new Button();
        bsoc.setText("Socialist");
        bsoc.setOnAction(e -> {
            primaryStage.setScene(gamescene);
        });
        Button bsde = new Button();
        bsde.setText("Social Democrat");
        bsde.setOnAction(e -> {
            primaryStage.setScene(gamescene);
        });
        Button blde = new Button();
        blde.setText("Social Liberal");
        blde.setOnAction(e -> {
            primaryStage.setScene(gamescene);
        });
        Button bcon = new Button();
        bcon.setText("Conservative");
        bcon.setOnAction(e -> {
            primaryStage.setScene(gamescene);
        });
        Button brea = new Button();
        brea.setText("Reactionary");
        brea.setOnAction(e -> {
            primaryStage.setScene(gamescene);
        });
        Button bfas = new Button();
        bfas.setText("Fascist");
        bfas.setOnAction(e -> {
            primaryStage.setScene(gamescene);
        });
        Button bnaz = new Button();
        bnaz.setText("National Socialist");
        bnaz.setOnAction(e -> {
            primaryStage.setScene(gamescene);
        });
        
        rootpick.getChildren().add(vb1);
        hb1.getChildren().add(bcom);
        hb1.getChildren().add(bsoc);
        hb1.getChildren().add(bsde);
        hb1.getChildren().add(blde);
        hb1.getChildren().add(bcon);
        hb1.getChildren().add(brea);
        hb1.getChildren().add(bfas);
        hb1.getChildren().add(bnaz);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
