/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polgame;

import java.awt.Color;
import java.awt.Image;
import java.awt.Insets;
import java.io.File;
import java.io.IOException;
import static java.lang.Math.abs;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import static jdk.nashorn.internal.objects.NativeMath.round;
import jdk.nashorn.internal.runtime.JSType;

/**
 *
 * @author komp
 */
public class Polgame extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        Label myparty = new Label("0");
        Label lmyseats = new Label("");
        Label lmypercent = new Label("");
        Label mypartyname = new Label("");
        Label lmyideol = new Label("");
        Label partysopinion = new Label("Parties' Opinion");
        partysopinion.setStyle("-fx-text-fill: #FFFFFF; -fx-text-size: 20px;");
        partysopinion.setLayoutX(766);
        partysopinion.setLayoutY(61);
        Label peoplesopinion = new Label("People's Opinion");
        peoplesopinion.setStyle("-fx-text-fill: #FFFFFF; -fx-text-size: 20px;");
        peoplesopinion.setLayoutX(926);
        peoplesopinion.setLayoutY(61);        
        Label publicdiscontent = new Label("Public Discontent");
        publicdiscontent.setStyle("-fx-text-fill: #FFFFFF; -fx-font-size: 28px;");
        publicdiscontent.setLayoutX(1096);
        publicdiscontent.setLayoutY(61);
        Label pubdis = new Label("" + 1);
        pubdis.setStyle("-fx-text-fill: #FFFFFF; -fx-font-size: 28px;");
        pubdis.setLayoutX(1331);
        pubdis.setLayoutY(62);
        boolean peopol = true;
        boolean peoimm = false;
        boolean peopbd = false;
        boolean peosuf = true;
        boolean peowar = true;
        mypartyname.setStyle("-fx-text-fill: #FFFFFF; -fx-font-size: 18px;");
        mypartyname.setLayoutX(20);
        mypartyname.setLayoutY(50);
        
        
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
        prvired[0] = s1;
        prvired[1] = s2;
        prvired[2] = s3;
        prvired[3] = s4;
        prvired[4] = s5;
        prvired[5] = s6;
        prvired[6] = s7;
        prvired[7] = s8;
        prvired[8] = s9;
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
        
        StackPane root = new StackPane();
        
        VBox policiesv = new VBox(20);
            HBox policiesh1 = new HBox(20);
                VBox policiesv1 = new VBox(20);
                    Label MinimumWage = new Label("Minimum Wage");
                    Label MinimumWageN = new Label("");
                VBox policiesv2 = new VBox(20);
                    Label Pension = new Label("Pensions");
                    Label PensionN = new Label("");
                VBox policiesv3 = new VBox(20);
                    Label HealthCare = new Label("Health Care");
                    Label HealthCareN = new Label("");
                VBox policiesv4 = new VBox(20);
                    Label Tax = new Label("High Taxes");
                    Label TaxN = new Label("");
                VBox policiesv5 = new VBox(20);
                    Label Pub = new Label("Public Sector");
                    Label PubN = new Label("");
            HBox policiesh2 = new HBox(20);
                Button poll = new Button();
                poll.setText("        Pollution        ");
                Button imm = new Button();
                imm.setText("     Immigration     ");
                Button pubed = new Button();
                pubed.setText("  Public Education  ");
            HBox policiesh3 = new HBox(20);
            policiesh3.alignmentProperty();
                Pane stupidthingthatihavetousebecausethisfuckingprogramminglanguagedoesntallowmetoproperlymakeadecentlookingtable = new Pane();
                stupidthingthatihavetousebecausethisfuckingprogramminglanguagedoesntallowmetoproperlymakeadecentlookingtable.setPrefSize(72, 1);
                VBox policiesv6 = new VBox(20);
                    Label Sufferage = new Label("         Sufferage");
                    Button suffb = new Button();                    /**Just for the record, css doesn't work. I'm not an idiot. I would have*/
                    suffb.setText("End The Republic");              /**this easier and faster if I could.*/
                VBox policiesv7 = new VBox(20);
                    Label War = new Label("        War Policy");
                    Button warb = new Button();
                    warb.setText("    Declare War    ");

        poll.setStyle("-fx-background-color: #ff4040;");
        imm.setStyle("-fx-background-color: #ff4040;");
        pubed.setStyle("-fx-background-color: #4CAF50;");
        suffb.setStyle("-fx-background-color: #4CAF50;");
        warb.setStyle("-fx-background-color: #4CAF50;");
        //suffb.setDisable(true);
        MinimumWageN.setStyle("-fx-text-fill: #FFFFFF; -fx-text-size: 20px;");
        PensionN.setStyle("-fx-text-fill: #FFFFFF; -fx-text-size: 20px;");
        HealthCareN.setStyle("-fx-text-fill: #FFFFFF; -fx-text-size: 20px;");
        TaxN.setStyle("-fx-text-fill: #FFFFFF; -fx-text-size: 20px;");
        PubN.setStyle("-fx-text-fill: #FFFFFF; -fx-text-size: 20px;");
        MinimumWage.setStyle("-fx-text-fill: #FFFFFF; -fx-text-size: 20px;");
        Pension.setStyle("-fx-text-fill: #FFFFFF; -fx-text-size: 20px;");
        HealthCare.setStyle("-fx-text-fill: #FFFFFF; -fx-text-size: 20px;");
        Tax.setStyle("-fx-text-fill: #FFFFFF; -fx-text-size: 20px;");
        Pub.setStyle("-fx-text-fill: #FFFFFF; -fx-text-size: 20px;");
        Sufferage.setStyle("-fx-text-fill: #FFFFFF; -fx-text-size: 40px;");
        War.setStyle("-fx-text-fill: #FFFFFF; -fx-text-size: 40px;");
        
        
        poll.setOnAction(e -> {
            if(poll.getBackground().toString().equals("javafx.scene.layout.Background@b1eb502a")){
                poll.setStyle("-fx-background-color: #ff4040;");
            }
            else{
                poll.setStyle("-fx-background-color: #4CAF50;");
            }
            });
        imm.setOnAction(e -> {
            if(imm.getBackground().toString().equals("javafx.scene.layout.Background@b1eb502a")){
                imm.setStyle("-fx-background-color: #ff4040;");
            }
            else{
                imm.setStyle("-fx-background-color: #4CAF50;");
            }
            });
        pubed.setOnAction(e -> {
            if(pubed.getBackground().toString().equals("javafx.scene.layout.Background@b1eb502a")){
                pubed.setStyle("-fx-background-color: #ff4040;");
            }
            else{
                pubed.setStyle("-fx-background-color: #4CAF50;");
            }
            });
        suffb.setOnAction(e -> {
            if(suffb.getBackground().toString().equals("javafx.scene.layout.Background@b1eb502a")){
                suffb.setStyle("-fx-background-color: #ff4040;");
            }
            /*if(suffb.getBackground().toString().equals("javafx.scene.layout.Background@a274602a"))*/else{
                suffb.setStyle("-fx-background-color: #4CAF50;");
            }
            });
        warb.setOnAction(e -> {
            if(warb.getBackground().toString().equals("javafx.scene.layout.Background@b1eb502a")){
                warb.setStyle("-fx-background-color: #ff4040;");
            }
            else{
                warb.setStyle("-fx-background-color: #4CAF50;");
            }
            });
        
        policiesv.getChildren().addAll(policiesh1, policiesh2, policiesh3);
            policiesh1.getChildren().addAll(policiesv1, policiesv2, policiesv3, policiesv4, policiesv5);
                policiesv1.getChildren().addAll(MinimumWage, MinimumWageN);
                policiesv2.getChildren().addAll(Pension, PensionN);
                policiesv3.getChildren().addAll(HealthCare, HealthCareN);
                policiesv4.getChildren().addAll(Tax, TaxN);
                policiesv5.getChildren().addAll(Pub, PubN);
            policiesh2.getChildren().addAll(poll, imm, pubed);
                policiesv6.getChildren().addAll(Sufferage, suffb);
                policiesv7.getChildren().addAll(War, warb);
            policiesh3.getChildren().addAll(stupidthingthatihavetousebecausethisfuckingprogramminglanguagedoesntallowmetoproperlymakeadecentlookingtable, policiesv6, policiesv7);
            
        policiesv.setLayoutX(100);
        policiesv.setLayoutY(350);
        
        
                party Communist = new party("Communist Party", "Communism", 4, "#4e0a16", 5, 5, 5, 5, 5, true, true, true, false, false);                        //gsc.setFill(Paint.valueOf(Communist.getColour()));
                party Socialist = new party("Socialist Party", "Socialism", 1.5, "#d10844", 4, 5, 4, 5, 4, true, true, true, true, true);                        //gss.setFill(Paint.valueOf(Socialist.getColour()));
                party SocialDemocrat = new party("Social Democrats", "Social Democracy", 17, "#ff82cf", 4, 4, 4, 4, 4, true, true, true, true, true);            //gssd.setFill(Paint.valueOf(SocialDemocrat.getColour()));
                party LiberalDemocrat = new party("Liberal Democrats", "Liberalism", 2.5, "#eaf455", 3, 3, 4, 4, 4, true, true, true, true, true);                  //gsld.setFill(Paint.valueOf(LiberalDemocrat.getColour()));
                party Conservative = new party("Conservative Party", "Conservatism", 17, "#2b20f9", 3, 3, 2, 2, 2, false, true, false, true, false);             // gst.setFill(Paint.valueOf(Conservative.getColour()));
                party Reactionary = new party("Restoration Party", "Monarchism", 1.5, "#0E1A8A", 2, 2, 2, 2, 2, false, false, false, false, true);              // gsr.setFill(Paint.valueOf(Reactionary.getColour()));
                party Fascist = new party("Fascist Party", "Fascism", 4, "#020209", 2, 1, 2, 1, 2, false, false, true, false, true);                      //gsf.setFill(Paint.valueOf(Fascist.getColour()));
                party NationalSocialist = new party("National Socialist Party", "National Socialism", 9, "#8B4513", 1, 1, 1, 1, 1, false, false, true, false, true);    // gsn.setFill(Paint.valueOf(NationalSocialist.getColour()));

                party[] partys = new party[8];
                partys[0] = Communist;
                partys[1] = Socialist;
                partys[2] = SocialDemocrat;
                partys[3] = LiberalDemocrat;
                partys[4] = Conservative;
                partys[5] = Reactionary;
                partys[6] = Fascist;
                partys[7] = NationalSocialist;
        int[] as = new int[8];
        
        HBox mypoliciesh = new HBox(20);
            VBox mypoliciesv1 = new VBox(31);
                Label myMinimumWage = new Label("Minimum Wage");
                Label myPension = new Label("Pensions");
                Label myHealthCare = new Label("Health Care");
                Label myTax = new Label("High Taxes");
                Label myPub = new Label("Public Sector");
                Label myPoll = new Label("Public Sector");
                Label myImm = new Label("Public Sector");
                Label myPubed = new Label("Public Sector");
                Label mySufferage = new Label("Public Sector");
                Label myWar = new Label("Public Sector");
                myMinimumWage.setStyle("-fx-text-fill: #FFFFFF; -fx-text-size: 20px;");
                myPension.setStyle("-fx-text-fill: #FFFFFF; -fx-text-size: 20px;");
                myHealthCare.setStyle("-fx-text-fill: #FFFFFF; -fx-text-size: 20px;");
                myTax.setStyle("-fx-text-fill: #FFFFFF; -fx-text-size: 20px;");
                myPub.setStyle("-fx-text-fill: #FFFFFF; -fx-text-size: 20px;");
                myPoll.setStyle("-fx-text-fill: #FFFFFF; -fx-text-size: 20px;");
                myImm.setStyle("-fx-text-fill: #FFFFFF; -fx-text-size: 20px;");
                myPubed.setStyle("-fx-text-fill: #FFFFFF; -fx-text-size: 20px;");
                mySufferage.setStyle("-fx-text-fill: #FFFFFF; -fx-text-size: 20px;");
                myWar.setStyle("-fx-text-fill: #FFFFFF; -fx-text-size: 20px;");
            VBox mypoliciesv2 = new VBox(20);
            
            double[] modfy = new double[8];
            modfy[0] = 0;
            modfy[1] = 0;
            modfy[2] = 0;
            modfy[3] = 0;
            modfy[4] = 0;
            modfy[5] = 0;
            modfy[6] = 0;
            modfy[7] = 0;
        
        int[][] allpos = new int[8][];
        int[] comops = new int[5];
        comops[0] = partys[0].getMinwage();
        comops[1] = partys[0].getPens();
        comops[2] = partys[0].getHc();
        comops[3] = partys[0].getTax();
        comops[4] = partys[0].getPubsec();
        int[] socops = new int[5];
        socops[0] = partys[1].getMinwage();
        socops[1] = partys[1].getPens();
        socops[2] = partys[1].getHc();
        socops[3] = partys[1].getTax();
        socops[4] = partys[1].getPubsec();
        int[] sdmops = new int[5];
        sdmops[0] = partys[2].getMinwage();
        sdmops[1] = partys[2].getPens();
        sdmops[2] = partys[2].getHc();
        sdmops[3] = partys[2].getTax();
        sdmops[4] = partys[2].getPubsec();
        int[] ldmops = new int[5];
        ldmops[0] = partys[3].getMinwage();
        ldmops[1] = partys[3].getPens();
        ldmops[2] = partys[3].getHc();
        ldmops[3] = partys[3].getTax();
        ldmops[4] = partys[3].getPubsec();
        int[] conops = new int[5];
        conops[0] = partys[4].getMinwage();
        conops[1] = partys[4].getPens();
        conops[2] = partys[4].getHc();
        conops[3] = partys[4].getTax();
        conops[4] = partys[4].getPubsec();
        int[] reaops = new int[5];
        reaops[0] = partys[5].getMinwage();
        reaops[1] = partys[5].getPens();
        reaops[2] = partys[5].getHc();
        reaops[3] = partys[5].getTax();
        reaops[4] = partys[5].getPubsec();
        int[] fasops = new int[5];
        fasops[0] = partys[6].getMinwage();
        fasops[1] = partys[6].getPens();
        fasops[2] = partys[6].getHc();
        fasops[3] = partys[6].getTax();
        fasops[4] = partys[6].getPubsec();
        int[] nazops = new int[5];
        nazops[0] = partys[7].getMinwage();
        nazops[1] = partys[7].getPens();
        nazops[2] = partys[7].getHc();
        nazops[3] = partys[7].getTax();
        nazops[4] = partys[7].getPubsec();
        
        allpos[0] = comops;
        allpos[1] = socops;
        allpos[2] = sdmops;
        allpos[3] = ldmops;
        allpos[4] = conops;
        allpos[5] = reaops;
        allpos[6] = fasops;
        allpos[7] = nazops;
            
                HBox mypoliciesh1 = new HBox(20);
                    Button myminwageminus = new Button();
                    Label myminwage = new Label();
                    myminwage.setStyle("-fx-text-fill: #FFFFFF; -fx-text-size: 20px;");
                    myminwageminus.setText(" - ");
                    myminwageminus.setOnAction(e -> {partys[Integer.valueOf(myparty.getText())].setMinwage(partys[Integer.valueOf(myparty.getText())].getMinwage()-1);
                                                     allpos[Integer.valueOf(myparty.getText())][0] = allpos[Integer.valueOf(myparty.getText())][0] - 1;
                                                     myminwage.setText("" + partys[Integer.valueOf(myparty.getText())].getMinwage());});
                    Button myminwageplus = new Button();
                    myminwageplus.setText(" + ");
                    myminwageplus.setOnAction(e -> {partys[Integer.valueOf(myparty.getText())].setMinwage(partys[Integer.valueOf(myparty.getText())].getMinwage()+1);
                                                    allpos[Integer.valueOf(myparty.getText())][0] = allpos[Integer.valueOf(myparty.getText())][0] + 1;
                                                    myminwage.setText("" + partys[Integer.valueOf(myparty.getText())].getMinwage());});
                    Label iamashamedofdoingthisbutimverytiredandcantthinkclearly1 = new Label(" ");
                    Button peominwageminus = new Button();
                    Label peominwage = new Label("" + 3);
                    peominwage.setStyle("-fx-text-fill: #FFFFFF; -fx-text-size: 20px;");
                    peominwageminus.setText(" - ");
                    peominwageminus.setOnAction(e -> {peominwage.setText((Integer.valueOf(peominwage.getText())-1) + "");});                           
                    Button peominwageplus = new Button();
                    peominwageplus.setText(" + ");
                    peominwageplus.setOnAction(e -> {peominwage.setText((Integer.valueOf(peominwage.getText())+1) + "");});
                    
                HBox mypoliciesh2 = new HBox(20);
                    Button mypensionminus = new Button();
                    Label mypension = new Label();
                    mypension.setStyle("-fx-text-fill: #FFFFFF; -fx-text-size: 20px;");
                    mypensionminus.setText(" - ");
                    mypensionminus.setOnAction(e -> {partys[Integer.valueOf(myparty.getText())].setPens(partys[Integer.valueOf(myparty.getText())].getPens()-1);
                                                     allpos[Integer.valueOf(myparty.getText())][1] = allpos[Integer.valueOf(myparty.getText())][1] - 1;
                                                     mypension.setText("" + partys[Integer.valueOf(myparty.getText())].getPens());});
                    Button mypensionplus = new Button();
                    mypensionplus.setText(" + ");
                    mypensionplus.setOnAction(e -> {partys[Integer.valueOf(myparty.getText())].setPens(partys[Integer.valueOf(myparty.getText())].getPens()+1);
                                                    allpos[Integer.valueOf(myparty.getText())][1] = allpos[Integer.valueOf(myparty.getText())][1] + 1;
                                                    mypension.setText("" + partys[Integer.valueOf(myparty.getText())].getPens());});
                    Label iamashamedofdoingthisbutimverytiredandcantthinkclearly2 = new Label(" ");
                    Button peopensionminus = new Button();
                    Label peopension = new Label("" + 3);
                    peopension.setStyle("-fx-text-fill: #FFFFFF; -fx-text-size: 20px;");
                    peopensionminus.setText(" - ");
                    peopensionminus.setOnAction(e -> {peopension.setText((Integer.valueOf(peopension.getText())-1) + "");});                           
                    Button peopensionplus = new Button();
                    peopensionplus.setText(" + ");
                    peopensionplus.setOnAction(e -> {peopension.setText((Integer.valueOf(peopension.getText())+1) + "");});
                HBox mypoliciesh3 = new HBox(20);
                    Button myhcminus = new Button();
                    Label myhc = new Label();
                    myhc.setStyle("-fx-text-fill: #FFFFFF; -fx-text-size: 20px;");
                    myhcminus.setText(" - ");
                    myhcminus.setOnAction(e -> {partys[Integer.valueOf(myparty.getText())].setHc(partys[Integer.valueOf(myparty.getText())].getHc()-1);
                                                     allpos[Integer.valueOf(myparty.getText())][2] = allpos[Integer.valueOf(myparty.getText())][2] - 1;
                                                     myhc.setText("" + partys[Integer.valueOf(myparty.getText())].getHc());});
                    Button myhcplus = new Button();
                    myhcplus.setText(" + ");
                    myhcplus.setOnAction(e -> {partys[Integer.valueOf(myparty.getText())].setHc(partys[Integer.valueOf(myparty.getText())].getHc()+1);
                                                    allpos[Integer.valueOf(myparty.getText())][2] = allpos[Integer.valueOf(myparty.getText())][2] + 1;
                                                    myhc.setText("" + partys[Integer.valueOf(myparty.getText())].getHc());});
                    Label iamashamedofdoingthisbutimverytiredandcantthinkclearly3 = new Label(" ");
                    Button peohcnminus = new Button();
                    Label peohc = new Label("" + 3);
                    peohc.setStyle("-fx-text-fill: #FFFFFF; -fx-text-size: 20px;");
                    peohcnminus.setText(" - ");
                    peohcnminus.setOnAction(e -> {peohc.setText((Integer.valueOf(peohc.getText())-1) + "");});                           
                    Button peohcplus = new Button();
                    peohcplus.setText(" + ");
                    peohcplus.setOnAction(e -> {peohc.setText((Integer.valueOf(peohc.getText())+1) + "");});
                HBox mypoliciesh4 = new HBox(20);
                    Button mytaxminus = new Button();
                    Label mytax = new Label();
                    mytax.setStyle("-fx-text-fill: #FFFFFF; -fx-text-size: 200px;");
                    mytaxminus.setText(" - ");
                    mytaxminus.setOnAction(e -> {partys[Integer.valueOf(myparty.getText())].setTax(partys[Integer.valueOf(myparty.getText())].getTax()-1);
                                                     allpos[Integer.valueOf(myparty.getText())][3] = allpos[Integer.valueOf(myparty.getText())][3] - 1;
                                                     mytax.setText("" + partys[Integer.valueOf(myparty.getText())].getTax());});
                    Button mytaxplus = new Button();
                    mytaxplus.setText(" + ");
                    mytaxplus.setOnAction(e -> {partys[Integer.valueOf(myparty.getText())].setTax(partys[Integer.valueOf(myparty.getText())].getTax()+1);
                                                    allpos[Integer.valueOf(myparty.getText())][3] = allpos[Integer.valueOf(myparty.getText())][3] + 1;
                                                    mytax.setText("" + partys[Integer.valueOf(myparty.getText())].getTax());});
                    Label iamashamedofdoingthisbutimverytiredandcantthinkclearly4 = new Label(" ");
                    Button peotaxminus = new Button();
                    Label lpeotax = new Label("" + 3);
                    lpeotax.setStyle("-fx-text-fill: #FFFFFF; -fx-text-size: 20px;");
                    peotaxminus.setText(" - ");
                    peotaxminus.setOnAction(e -> {lpeotax.setText((Integer.valueOf(lpeotax.getText())-1) + "");});                           
                    Button peotaxplus = new Button();
                    peotaxplus.setText(" + ");
                    peotaxplus.setOnAction(e -> {lpeotax.setText((Integer.valueOf(lpeotax.getText())+1) + "");});
                HBox mypoliciesh5 = new HBox(20);
                    Button mypubminus = new Button();
                    Label mypub = new Label();
                    mypub.setStyle("-fx-text-fill: #FFFFFF; -fx-text-size: 20px;");
                    mypubminus.setText(" - ");
                    mypubminus.setOnAction(e -> {partys[Integer.valueOf(myparty.getText())].setPubsec(partys[Integer.valueOf(myparty.getText())].getPubsec()-1);
                                                     allpos[Integer.valueOf(myparty.getText())][4] = allpos[Integer.valueOf(myparty.getText())][4] - 1;
                                                     mypub.setText("" + partys[Integer.valueOf(myparty.getText())].getPubsec());});
                    Button mypubplus = new Button();
                    mypubplus.setText(" + ");
                    mypubplus.setOnAction(e -> {partys[Integer.valueOf(myparty.getText())].setPubsec(partys[Integer.valueOf(myparty.getText())].getPubsec()+1);
                                                    allpos[Integer.valueOf(myparty.getText())][4] = allpos[Integer.valueOf(myparty.getText())][4] + 1;
                                                    mypub.setText("" + partys[Integer.valueOf(myparty.getText())].getPubsec());});
                    Label iamashamedofdoingthisbutimverytiredandcantthinkclearly5 = new Label(" ");
                    Button peopubminus = new Button();
                    Label lpeopub = new Label("" + 3);
                    lpeopub.setStyle("-fx-text-fill: #FFFFFF; -fx-text-size: 20px;");
                    peopubminus.setText(" - ");
                    peopubminus.setOnAction(e -> {lpeopub.setText((Integer.valueOf(lpeopub.getText())-1) + "");});                           
                    Button peopubplus = new Button();
                    peopubplus.setText(" + ");
                    peopubplus.setOnAction(e -> {lpeopub.setText((Integer.valueOf(lpeopub.getText())+1) + "");});
                    
            
        
        mypoliciesh.getChildren().addAll(mypoliciesv1, mypoliciesv2);
            mypoliciesv1.getChildren().addAll(myMinimumWage, myPension, myHealthCare, myTax, myPub, myPoll, myImm, myPubed, mySufferage, myWar);
            mypoliciesv2.getChildren().addAll(mypoliciesh1, mypoliciesh2, mypoliciesh3, mypoliciesh4, mypoliciesh5);
                mypoliciesh1.getChildren().addAll(myminwageminus, myminwage, myminwageplus, iamashamedofdoingthisbutimverytiredandcantthinkclearly1, peominwageminus, peominwage, peominwageplus);
                mypoliciesh2.getChildren().addAll(mypensionminus, mypension, mypensionplus, iamashamedofdoingthisbutimverytiredandcantthinkclearly2, peopensionminus, peopension, peopensionplus);
                mypoliciesh3.getChildren().addAll(myhcminus, myhc, myhcplus, iamashamedofdoingthisbutimverytiredandcantthinkclearly3, peohcnminus, peohc, peohcplus);
                mypoliciesh4.getChildren().addAll(mytaxminus, mytax, mytaxplus, iamashamedofdoingthisbutimverytiredandcantthinkclearly4, peotaxminus, lpeotax, peotaxplus);
                mypoliciesh5.getChildren().addAll(mypubminus, mypub, mypubplus, iamashamedofdoingthisbutimverytiredandcantthinkclearly5, peopubminus, lpeopub, peopubplus);
            
        mypoliciesh.setLayoutX(630);
        mypoliciesh.setLayoutY(100);
        
        AnchorPane ap = new AnchorPane();
        ap.getChildren().addAll(policiesv, mypoliciesh, partysopinion, peoplesopinion, publicdiscontent, pubdis);
        
        Label[] myopinions = new Label[5];
        myopinions[0] = myminwage;
        myopinions[1] = mypension;
        myopinions[2] = myhc;
        myopinions[3] = mytax;
        myopinions[4] = mypub;
        
        Label[] peoplesopinions = new Label[5];
        peoplesopinions[0] = peominwage;
        peoplesopinions[1] = peopension;
        peoplesopinions[2] = peohc;
        peoplesopinions[3] = lpeotax;
        peoplesopinions[4] = lpeopub;
        /*double dminw = 3;
        double dpen = 3;
        double dhc = 3;
        double dtax = 3;
        double dpub = 3;*/
        Button ELECTIONS = new Button();
        ELECTIONS.setText("ELECTIONS");
        ELECTIONS.setOnAction((ActionEvent e) -> {

            for (Circle[] redredova1 : redredova) {
                for (Circle item : redredova1) {
                    item.setFill(Paint.valueOf("#7e7e7e"));
                }
            }
            
            for(int i = 0; i < 8; i++){
                modfy[i] = 0;       //resets modifiers
            }
            for(int o = 0; o < 5; o++){
                if(Integer.valueOf(myopinions[o].getText()) > 5){myopinions[o].setText(5 + "");}   //temporary fix so policies wont be
                if(Integer.valueOf(myopinions[o].getText()) < 1){myopinions[o].setText(1 + "");}   //over 5 or under 0
            }
            
        for(int p = 0; p < 8; p++){
            for(int o = 0; o < 5; o++){
                if(allpos[p][o] == Integer.valueOf(peoplesopinions[o].getText())){
                    for(int i = 0; i < p; i++){
                        modfy[i] = modfy[i] - 0.5;  //this line crashes
                    }
                    modfy[p] = modfy[p] + 3.5;
                    for(int i = p+1; i < 8; i++){
                        modfy[i] = modfy[i] - 0.5;
                    }
                }
                if((allpos[p][o]-Integer.valueOf(peoplesopinions[o].getText()))*(allpos[p][o]-Integer.valueOf(peoplesopinions[o].getText())) == 1){
                    for(int i = 0; i < p; i++){
                        modfy[i] = modfy[i] + 0.175;
                    }
                    modfy[p] = modfy[p] - 0.875;
                    for(int i = p+1; i < 8; i++){
                        modfy[i] = modfy[i] + 0.175;
                    }
                }
                if((allpos[p][o]-Integer.valueOf(peoplesopinions[o].getText()))*(allpos[p][o]-Integer.valueOf(peoplesopinions[o].getText())) == 4){
                    for(int i = 0; i < p; i++){
                        modfy[i] = modfy[i] + 0.25;
                    }
                    modfy[p] = modfy[p] - 1.75;
                    for(int i = p+1; i < 8; i++){
                        modfy[i] = modfy[i] + 0.5;
                    }
                }
                if((allpos[p][o]-Integer.valueOf(peoplesopinions[o].getText()))*(allpos[p][o]-Integer.valueOf(peoplesopinions[o].getText())) == 9){
                    for(int i = 0; i < p; i++){
                        modfy[i] = modfy[i] + 0.5;
                    }
                    modfy[p] = modfy[p] - 3.5;
                    for(int i = p+1; i < 8; i++){
                        modfy[i] = modfy[i] + 0.5;
                    }
                }
                if((allpos[p][o]-Integer.valueOf(peoplesopinions[o].getText()))*(allpos[p][o]-Integer.valueOf(peoplesopinions[o].getText())) == 16){
                    for(int i = 0; i < p; i++){
                        modfy[i] = modfy[i] + 0.7142857142857143;
                    }
                    modfy[p] = modfy[p] - 5;
                    for(int i = p+1; i < 8; i++){
                        modfy[i] = modfy[i] + 0.7142857142857143;
                    }
                }
            }
        }
        
        double dminw;
        double dpen;
        double dhc;
        double dtax;
        double dpub;
        
        modfy[0] = modfy[0] + Double.valueOf(pubdis.getText())*6;
        modfy[7] = modfy[7] + Double.valueOf(pubdis.getText())*6;
        modfy[1] = modfy[1] + Double.valueOf(pubdis.getText())*3;
        modfy[6] = modfy[6] + Double.valueOf(pubdis.getText())*3;
        
        for(int p = 0; p < 8; p++){
            if(partys[p].getVotewon()+modfy[p] < 0){partys[p].setVotewon(0); modfy[p] = 0;}
            if(partys[p].getVotewon()+modfy[p] > 100){partys[p].setVotewon(100); modfy[p] = 0;}
        }
        
        double aper = 0;
        for(int p = 0; p < 8; p++){
            aper = aper + partys[p].getVotewon()+modfy[p];
        }
        double h = 95/aper;
        for(int p = 0; p < 8; p++){
            partys[p].setVotewon((partys[p].getVotewon()+modfy[p])*h);
        }
        
            for(int j = 0; j < 8; j++){
                    int cs = (int) Math.round ((partys[0].getVotewon())*(0.18 + 0.02*j));
                    for(int m = 0; m < cs; m++){
                            redredova[j][m].setFill(Paint.valueOf(partys[0].getColour()));
                        }
                    int ss = (int) Math.round ((partys[1].getVotewon())*(0.18 + 0.02*j));
                    for(int m = 0; m < ss; m++){
                            redredova[j][cs+m].setFill(Paint.valueOf(partys[1].getColour()));
                        }
                    int sds = (int) Math.round ((partys[2].getVotewon())*(0.18 + 0.02*j));
                    for(int m = 0; m < sds; m++){
                            redredova[j][cs+ss+m].setFill(Paint.valueOf(partys[2].getColour()));
                        }
                    int lds = (int) Math.round ((partys[3].getVotewon())*(0.18 + 0.02*j));
                    for(int m = 0; m < lds; m++){
                            redredova[j][cs+ss+sds+m].setFill(Paint.valueOf(partys[3].getColour()));
                        }
                    int ns = (int) Math.round ((partys[7].getVotewon())*(0.18 + 0.02*j));
                    for(int m = 0; m < ns; m++){
                            redredova[j][18+j*2-1-m].setFill(Paint.valueOf(partys[7].getColour()));
                        }
                    int fs = (int) Math.round ((partys[6].getVotewon())*(0.18 + 0.02*j));
                    for(int m = 0; m < fs; m++){
                            redredova[j][18+j*2-ns-1-m].setFill(Paint.valueOf(partys[6].getColour()));
                        }
                    int rs = (int) Math.round ((partys[5].getVotewon())*(0.18 + 0.02*j));
                    for(int m = 0; m < rs; m++){
                            redredova[j][18+j*2-ns-fs-1-m].setFill(Paint.valueOf(partys[5].getColour()));
                        }
                    int ts = (int) Math.round ((partys[4].getVotewon())*(0.18 + 0.02*j));
                    for(int m = 0; m < ts; m++){
                            redredova[j][18+j*2-ns-fs-rs-1-m].setFill(Paint.valueOf(partys[4].getColour()));
                        }
            }  
                int acs = 0;    as[0] = acs;
                int ass = 0;    as[1] = ass;
                int asds = 0;   as[2] = asds;
                int alds = 0;   as[3] = alds;
                int ats = 0;    as[4] = ats;
                int ars = 0;    as[5] = ars;
                int afs = 0;    as[6] = afs;
                int ans = 0;    as[7] = ans;
                double seatsfilled = 0.0;
                for (int p = 0; p<8; p++){
                    for (int i = 0; i<redredova.length; i++){
                        for (int j = 0; j<redredova[i].length; j++){
                            if (redredova[i][j].getFill().equals(Paint.valueOf(partys[p].getColour()))){
                                as[p]++;
                                seatsfilled++;
                            }
                        }
                    }
                }
                acs = as[0];
                ass = as[1];
                asds = as[2];
                alds = as[3];
                ats = as[4];
                ars = as[5];
                afs = as[6];
                ans = as[7];
                
            lmyseats.setText(as[Integer.valueOf(myparty.getText())] + " seats");
            lmyseats.setStyle("-fx-text-fill: #FFFFFF; -fx-text-size: 20px;");
            lmyseats.setLayoutX(20);
            lmyseats.setLayoutY(90);
            lmypercent.setText((partys[Integer.valueOf(myparty.getText())].getVotewon()) + "%");
            lmypercent.setStyle("-fx-text-fill: #FFFFFF; -fx-text-size: 20px;");
            lmypercent.setLayoutX(20);
            lmypercent.setLayoutY(110);
            lmyideol.setText(partys[Integer.valueOf(myparty.getText())].getIdeology() + "");
            lmyideol.setStyle("-fx-text-fill: #FFFFFF; -fx-text-size: 20px;");
            lmyideol.setLayoutX(20);
            lmyideol.setLayoutY(130);
            
            dminw = (Communist.getMinwage()*acs+Socialist.getMinwage()*ass+SocialDemocrat.getMinwage()*asds+LiberalDemocrat.getMinwage()*alds+Conservative.getMinwage()*ats+Reactionary.getMinwage()*ars+Fascist.getMinwage()*afs+NationalSocialist.getMinwage()*ans)/seatsfilled;
            dminw = Math.round(dminw * 100);
            dminw = dminw/100;
            MinimumWageN.setText("          " + dminw);
            
            
            dpen = (Communist.getPens()*acs+Socialist.getPens()*ass+SocialDemocrat.getPens()*asds+LiberalDemocrat.getPens()*alds+Conservative.getPens()*ats+Reactionary.getPens()*ars+Fascist.getPens()*afs+NationalSocialist.getPens()*ans)/seatsfilled;
            dpen = Math.round(dpen * 100);
            dpen = dpen/100;
            PensionN.setText("   " + dpen);
            
            
            dhc = (Communist.getHc()*acs+Socialist.getHc()*ass+SocialDemocrat.getHc()*asds+LiberalDemocrat.getHc()*alds+Conservative.getHc()*ats+Reactionary.getHc()*ars+Fascist.getHc()*afs+NationalSocialist.getHc()*ans)/seatsfilled;
            dhc = Math.round(dhc * 100);
            dhc = dhc/100;
            HealthCareN.setText("     " + dhc);
            
            
            dtax = (Communist.getTax()*acs+Socialist.getTax()*ass+SocialDemocrat.getTax()*asds+LiberalDemocrat.getTax()*alds+Conservative.getTax()*ats+Reactionary.getTax()*ars+Fascist.getTax()*afs+NationalSocialist.getTax()*ans)/seatsfilled;
            dtax = Math.round(dtax * 100);
            dtax = dtax/100;
            TaxN.setText("     " + dtax);
            
            
            dpub = (Communist.getPubsec()*acs+Socialist.getPubsec()*ass+SocialDemocrat.getPubsec()*asds+LiberalDemocrat.getPubsec()*alds+Conservative.getPubsec()*ats+Reactionary.getPubsec()*ars+Fascist.getPubsec()*afs+NationalSocialist.getPubsec()*ans)/seatsfilled;
            dpub = Math.round(dpub * 100);
            dpub = dpub/100;
            PubN.setText("      " + dpub);
            
            pubdis.setText("" + (abs(dminw-Integer.valueOf(peoplesopinions[0].getText())) + abs(dpen-Integer.valueOf(peoplesopinions[1].getText())) + abs(dhc-Integer.valueOf(peoplesopinions[2].getText())) + abs(dtax-Integer.valueOf(peoplesopinions[3].getText())) + abs(dpub-Integer.valueOf(peoplesopinions[4].getText()))));
            
        });
        Button nextturn = new Button();
        nextturn.setText("NEXT TURN ----->");
        nextturn.setOnAction(e -> {
            
        });
        
        
        ap.getChildren().addAll(lmyseats, lmypercent, lmyideol);
        
        
        ELECTIONS.setLayoutX(295 - ELECTIONS.getWidth());
        ELECTIONS.setLayoutY(265 - ELECTIONS.getHeight());
        
        MenuBar menuBar = new MenuBar();
        Menu menuGame = new Menu("Game");
        MenuItem Exit = new MenuItem("Exit");
        Exit.setOnAction(e -> {Platform.exit();});
        MenuItem NewGame = new MenuItem("New Game");
        menuGame.getItems().addAll(NewGame, Exit);
        Menu menuHelp = new Menu("Help");
        menuHelp.setOnAction(e -> {
            menuHelp.setText("No help for you!");
        });
        menuBar.getMenus().addAll(menuGame, menuHelp);
        menuBar.prefWidthProperty().bind(primaryStage.widthProperty());
        
        /** goes through all 200 seats and puts them on the anchorpane*/
        for (Circle[] redredova1 : redredova) {
            for (Circle item : redredova1) {
                item.setLayoutX(item.getLayoutX() + 40);
                item.setLayoutY(item.getLayoutY() + 20);
                ap.getChildren().add(item);
                
                item.setOnMouseEntered(e -> {
                    for (Circle[] redredova2 : redredova) {
                        for (Circle item1 : redredova2) {
                            if (item.getFill().equals(item1.getFill())) {
                                item1.setStroke(Paint.valueOf("#000000"));
                                item1.setStrokeWidth(1.5);
                            }
                        }
                    }
                    boolean foundparty = false;
                    for (int j = 0; j < 8; j++){
                        if (item.getFill().equals(Paint.valueOf(partys[j].getColour()))) {
                            foundparty = true;
                            mypartyname.setText("" + partys[j].getName());
                            lmyseats.setText(as[j] + " seats");
                            lmypercent.setText((partys[j].getVotewon()) + "%");
                            lmyideol.setText(partys[j].getIdeology() + "");
                            myminwage.setText("" + partys[j].getMinwage());
                            mypension.setText("" + partys[j].getPens());
                            myhc.setText("" + partys[j].getHc());
                            mytax.setText("" + partys[j].getTax());
                            mypub.setText("" + partys[j].getPubsec());
                        }
                        if (foundparty == false)
                        {
                            mypartyname.setText("Independents");
                            lmyseats.setText((200 - as[0] - as[1] - as[2] - as[3] - as[4] - as[5] - as[6] - as[7]) + " seats");
                            lmypercent.setText("  ");
                            lmyideol.setText("  ");
                            myminwage.setText("  ");
                            mypension.setText("  ");
                            myhc.setText("  ");
                            mytax.setText("  ");
                            mypub.setText("  ");
                        }
                    }
                });
                item.setOnMouseExited(e -> {
                    for (Circle[] redredova2 : redredova) {
                        for (Circle item1 : redredova2) {
                            if (item.getFill().equals(item1.getFill())) {
                                item1.setStroke(Paint.valueOf("#000000"));
                                item1.setStrokeWidth(0);
                            }
                        }
                    }
                    mypartyname.setText("" + partys[Integer.valueOf(myparty.getText())].getName());
                    lmyseats.setText(as[Integer.valueOf(myparty.getText())] + " seats");
                    lmypercent.setText((partys[Integer.valueOf(myparty.getText())].getVotewon()) + "%");
                    lmyideol.setText(partys[Integer.valueOf(myparty.getText())].getIdeology() + "");
                    myminwage.setText("" + partys[Integer.valueOf(myparty.getText())].getMinwage());
                    mypension.setText("" + partys[Integer.valueOf(myparty.getText())].getPens());
                    myhc.setText("" + partys[Integer.valueOf(myparty.getText())].getHc());
                    mytax.setText("" + partys[Integer.valueOf(myparty.getText())].getTax());
                    mypub.setText("" + partys[Integer.valueOf(myparty.getText())].getPubsec());
                });
            }
        }
        
        
        ap.getChildren().addAll(menuBar, ELECTIONS);
        root.getChildren().addAll(ap);
        
        StackPane rootpick = new StackPane();
        VBox vb1 = new VBox(20);
        HBox hb1 = new HBox(20);
        HBox hb2 = new HBox(20);
        HBox hb3 = new HBox(20);
        HBox hb4 = new HBox(20);
        
        Scene gamescene = new Scene(root, 1700, 750);
        Scene pickpartyscene = new Scene(rootpick, 1470, 700);
        gamescene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());      
        pickpartyscene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        
                
        primaryStage.setTitle("PolGame");
        primaryStage.setScene(pickpartyscene);
        primaryStage.show();
        //primaryStage.getIcons().add(javafx.scene.image.Image.impl_fromPlatformImage("image.png"));
        
        Label pickyourparty = new Label("                          Pick Your Party");
        pickyourparty.setStyle("-fx-text-fill: aliceblue; -fx-font-size: 72px;");
        hb2.getChildren().addAll(pickyourparty);
        
        Label pickpartyname = new Label("Party Name:        ");
        TextField tfpartyname = new TextField();
        pickpartyname.setStyle("-fx-text-fill: aliceblue; -fx-font-size: 32px;");
        tfpartyname.setStyle("-fx-font-size: 22px;");
        
        Label pickpartyideol = new Label("Party Ideology:    ");
        TextField tfpartyideol = new TextField();
        pickpartyideol.setStyle("-fx-text-fill: aliceblue; -fx-font-size: 32px;");
        tfpartyideol.setStyle("-fx-font-size: 22px;");
        
        Button bcom = new Button();
        bcom.setText("    Communist    ");
        bcom.setStyle("-fx-background-color: #4e0a16; -fx-text-fill: #FFFFFF; -fx-background-radius:6; -fx-padding: 15px 32px; -fx-width: 2350px");
        bcom.setOnAction(e -> {
            myparty.setText("0");
            tfpartyname.setText("Communist Party");
            tfpartyideol.setText("" + partys[Integer.valueOf(myparty.getText())].getIdeology());
        });
        Button bsoc = new Button();
        bsoc.setText("    Socialist    ");
        bsoc.setStyle("-fx-background-color: #d10844; -fx-text-fill: #FFFFFF; -fx-background-radius:6; -fx-padding: 15px 32px; -fx-width: 2350px");
        bsoc.setOnAction(e -> {
            myparty.setText("1");
            tfpartyname.setText("Socialist Party");
            tfpartyideol.setText("" + partys[Integer.valueOf(myparty.getText())].getIdeology());
        });
        Button bsde = new Button();
        bsde.setText(" Social Democrat ");
        bsde.setStyle("-fx-background-color: #ff82cf; -fx-text-fill: #FFFFFF; -fx-background-radius:6; -fx-padding: 15px 32px; -fx-width: 2350px");
        bsde.setOnAction(e -> {
            myparty.setText("2");
            tfpartyname.setText("Social Democratic Party");
            tfpartyideol.setText("" + partys[Integer.valueOf(myparty.getText())].getIdeology());
        });
        Button blde = new Button();
        blde.setText("  Social Liberal  ");
        blde.setStyle("-fx-background-color: #eaf455; -fx-text-fill: #000000; -fx-background-radius:6; -fx-padding: 15px 32px; -fx-width: 2350px");
        blde.setOnAction(e -> {
            myparty.setText("3");
            tfpartyname.setText("Social Liberal Party");
            tfpartyideol.setText("" + partys[Integer.valueOf(myparty.getText())].getIdeology());
        });
        Button bcon = new Button();
        bcon.setText("   Conservative   ");
        bcon.setStyle("-fx-background-color: #2b20f9; -fx-text-fill: #FFFFFF; -fx-background-radius:6; -fx-padding: 15px 32px; -fx-width: 2350px");
        bcon.setOnAction(e -> {
            myparty.setText("4");
            tfpartyname.setText("Conservative Party");
            tfpartyideol.setText("" + partys[Integer.valueOf(myparty.getText())].getIdeology());
        });
        Button brea = new Button();
        brea.setText("   Reactionary   ");
        brea.setStyle("-fx-background-color: #0E1A8A; -fx-text-fill: #FFFFFF; -fx-background-radius:6; -fx-padding: 15px 32px; -fx-width: 2350px");
        brea.setOnAction(e -> {
            myparty.setText("5");
            tfpartyname.setText("Reactionary Party");
            tfpartyideol.setText("" + partys[Integer.valueOf(myparty.getText())].getIdeology());
        });
        Button bfas = new Button();
        bfas.setText("    Fascist    ");
        bfas.setStyle("-fx-background-color: #020209; -fx-text-fill: #FFFFFF; -fx-background-radius:6; -fx-padding: 15px 32px; -fx-width: 2350px");
        bfas.setOnAction(e -> {
            myparty.setText("6");
            tfpartyname.setText("Fascist Party");
            tfpartyideol.setText("" + partys[Integer.valueOf(myparty.getText())].getIdeology());
        });
        Button bnaz = new Button();
        bnaz.setText("National Socialist");
        bnaz.setStyle("-fx-background-color: #8B4513; -fx-text-fill: #FFFFFF; -fx-background-radius:6; -fx-padding: 15px 32px; -fx-width: 2350px");
        bnaz.setOnAction(e -> {
            myparty.setText("7");
            tfpartyname.setText("National Socialist Party");
            tfpartyideol.setText("" + partys[Integer.valueOf(myparty.getText())].getIdeology());
        });
        myparty.setStyle("-fx-text-fill: #585c63");
        root.getChildren().addAll(myparty);
        
        /*Button[] pickpartybuttons = new Button[8];
        pickpartybuttons[0] = bcom;
        pickpartybuttons[1] = bsoc;
        pickpartybuttons[2] = bsde;
        pickpartybuttons[3] = blde;
        pickpartybuttons[4] = bcon;         simplifying things
        pickpartybuttons[5] = brea;         is complicated!
        pickpartybuttons[6] = bfas;         
        pickpartybuttons[7] = bnaz;
        
        for (int i = 0; i<8; i++){
            pickpartybuttons[i].setOnAction(e -> {
                myparty.setText("" + i);
            tfpartyname.setText("National Socialist Party");
            });
        }*/
        
        Button gotogamescene = new Button();
        gotogamescene.setText("     GO TO PARLIAMENT     ");
        gotogamescene.setStyle("-fx-background-color: #585c63; -fx-text-fill: #000000; -fx-background-radius:6; -fx-padding: 15px 32px; -fx-width: 2350px; -fx-text-size: 56px;");
        gotogamescene.setOnAction(e -> {
            //mypartyname.setText("");
            partys[Integer.valueOf(myparty.getText())].setName(tfpartyname.getText());
            partys[Integer.valueOf(myparty.getText())].setIdeology(tfpartyideol.getText());
            mypartyname.setText("" + partys[Integer.valueOf(myparty.getText())].getName());
            lmyideol.setText("" + partys[Integer.valueOf(myparty.getText())].getName());
            primaryStage.setScene(gamescene);
            myminwage.setText("" + partys[Integer.valueOf(myparty.getText())].getMinwage());
            mypension.setText("" + partys[Integer.valueOf(myparty.getText())].getPens());
            myhc.setText("" + partys[Integer.valueOf(myparty.getText())].getHc());
            mytax.setText("" + partys[Integer.valueOf(myparty.getText())].getTax());
            mypub.setText("" + partys[Integer.valueOf(myparty.getText())].getPubsec());
            
        });
        ap.getChildren().addAll(mypartyname);
                    
        hb3.getChildren().addAll(pickpartyname, tfpartyname);
        hb4.getChildren().addAll(pickpartyideol, tfpartyideol, gotogamescene);
        
        vb1.getChildren().addAll(hb1, hb2, hb3, hb4);
        
        rootpick.getChildren().add(vb1);
        hb1.getChildren().addAll(bcom, bsoc, bsde, blde, bcon, brea, bfas, bnaz);
        
        NewGame.setOnAction(e -> {
            primaryStage.setScene(pickpartyscene);
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
