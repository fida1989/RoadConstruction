/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package roadconstruction;

/**
 *
 * @author fida
 */
public class Constants {

    public static String APP_NAME = "Road Design";

    public static double round(double value, int places) {
        if (places < 0) {
            throw new IllegalArgumentException();
        }

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

    public static double getIsg(int value) {
        double d = 0.0;
        if (value == 2) {
            d = 450;
        } else if (value == 3) {
            d = 300;
        } else if (value == 4) {
            d = 250;
        } else if (value == 5) {
            d = 200;
        } else if (value == 6) {
            d = 200;
        } else if (value == 7) {
            d = 200;
        } else if (value == 8) {
            d = 200;
        } else if (value == 9) {
            d = 200;
        } else if (value == 10) {
            d = 200;
        } else {
        }
        return d;
    }

    public static void setThickness(int msa, int cbr) {
        Thickness.total = 0;
        Thickness.ac = 0;
        Thickness.dbm = 0;
        Thickness.wbm = 0;
        Thickness.gsb = 0;
        if (cbr == 2) {
            if (msa == 1) {
                Thickness.total = 660;
                Thickness.ac = 20;
                Thickness.dbm = 1;
                Thickness.wbm = 225;
                Thickness.gsb = 435;
            } else if (msa == 2) {
                Thickness.total = 715;
                Thickness.ac = 20;
                Thickness.dbm = 50;
                Thickness.wbm = 225;
                Thickness.gsb = 440;
            } else if (msa == 3) {
                Thickness.total = 750;
                Thickness.ac = 20;
                Thickness.dbm = 60;
                Thickness.wbm = 250;
                Thickness.gsb = 440;
            } else if (msa == 4) {
                Thickness.total = 765;
                Thickness.ac = 20;
                Thickness.dbm = 60;
                Thickness.wbm = 250;
                Thickness.gsb = 450;
            } else if (msa == 5) {
                Thickness.total = 795;
                Thickness.ac = 25;
                Thickness.dbm = 70;
                Thickness.wbm = 250;
                Thickness.gsb = 450;
            } else if (msa == 6) {
                Thickness.total = 805;
                Thickness.ac = 40;
                Thickness.dbm = 70;
                Thickness.wbm = 250;
                Thickness.gsb = 450;
            } else if (msa == 7) {
                Thickness.total = 820;
                Thickness.ac = 40;
                Thickness.dbm = 80;
                Thickness.wbm = 250;
                Thickness.gsb = 450;
            } else if (msa == 8) {
                Thickness.total = 830;
                Thickness.ac = 40;
                Thickness.dbm = 80;
                Thickness.wbm = 250;
                Thickness.gsb = 450;
            } else if (msa == 9) {
                Thickness.total = 840;
                Thickness.ac = 40;
                Thickness.dbm = 90;
                Thickness.wbm = 250;
                Thickness.gsb = 450;
            } else if (msa < 20 && msa >= 10) {
                Thickness.total = 850;
                Thickness.ac = 40;
                Thickness.dbm = 100;
                Thickness.wbm = 250;
                Thickness.gsb = 450;
            } else if (msa < 30 && msa >= 20) {
                Thickness.total = 880;
                Thickness.ac = 40;
                Thickness.dbm = 130;
                Thickness.wbm = 250;
                Thickness.gsb = 460;
            } else if (msa < 50 && msa >= 30) {
                Thickness.total = 900;
                Thickness.ac = 40;
                Thickness.dbm = 150;
                Thickness.wbm = 250;
                Thickness.gsb = 460;
            } else if (msa < 100 && msa >= 50) {
                Thickness.total = 925;
                Thickness.ac = 40;
                Thickness.dbm = 175;
                Thickness.wbm = 250;
                Thickness.gsb = 460;
            } else if (msa < 150 && msa >= 100) {
                Thickness.total = 955;
                Thickness.ac = 50;
                Thickness.dbm = 195;
                Thickness.wbm = 250;
                Thickness.gsb = 460;
            } else if (msa >= 150) {
                Thickness.total = 975;
                Thickness.ac = 50;
                Thickness.dbm = 195;
                Thickness.wbm = 250;
                Thickness.gsb = 460;
            } else {
            }
        } else if (cbr == 3) {
            if (msa == 1) {
                Thickness.total = 550;
                Thickness.ac = 20;
                Thickness.dbm = 1;
                Thickness.wbm = 150;
                Thickness.gsb = 435;
            } else if (msa == 2) {
                Thickness.total = 610;
                Thickness.ac = 20;
                Thickness.dbm = 50;
                Thickness.wbm = 160;
                Thickness.gsb = 335;
            } else if (msa == 3) {
                Thickness.total = 645;
                Thickness.ac = 20;
                Thickness.dbm = 60;
                Thickness.wbm = 150;
                Thickness.gsb = 335;
            } else if (msa == 4) {
                Thickness.total = 660;
                Thickness.ac = 40;
                Thickness.dbm = 60;
                Thickness.wbm = 160;
                Thickness.gsb = 335;
            } else if (msa == 5) {
                Thickness.total = 690;
                Thickness.ac = 40;
                Thickness.dbm = 60;
                Thickness.wbm = 150;
                Thickness.gsb = 335;
            } else if (msa == 6) {
                Thickness.total = 700;
                Thickness.ac = 40;
                Thickness.dbm = 70;
                Thickness.wbm = 250;
                Thickness.gsb = 350;
            } else if (msa == 7) {
                Thickness.total = 720;
                Thickness.ac = 40;
                Thickness.dbm = 70;
                Thickness.wbm = 250;
                Thickness.gsb = 360;
            } else if (msa == 8) {
                Thickness.total = 740;
                Thickness.ac = 40;
                Thickness.dbm = 80;
                Thickness.wbm = 250;
                Thickness.gsb = 370;
            } else if (msa == 9) {
                Thickness.total = 750;
                Thickness.ac = 40;
                Thickness.dbm = 90;
                Thickness.wbm = 250;
                Thickness.gsb = 380;
            } else if (msa < 20 && msa >= 10) {
                Thickness.total = 760;
                Thickness.ac = 40;
                Thickness.dbm = 90;
                Thickness.wbm = 250;
                Thickness.gsb = 380;
            } else if (msa < 30 && msa >= 20) {
                Thickness.total = 790;
                Thickness.ac = 40;
                Thickness.dbm = 120;
                Thickness.wbm = 250;
                Thickness.gsb = 380;
            } else if (msa < 50 && msa >= 30) {
                Thickness.total = 810;
                Thickness.ac = 40;
                Thickness.dbm = 140;
                Thickness.wbm = 250;
                Thickness.gsb = 380;
            } else if (msa < 100 && msa >= 50) {
                Thickness.total = 830;
                Thickness.ac = 40;
                Thickness.dbm = 160;
                Thickness.wbm = 250;
                Thickness.gsb = 380;
            } else if (msa < 150 && msa >= 100) {
                Thickness.total = 860;
                Thickness.ac = 50;
                Thickness.dbm = 180;
                Thickness.wbm = 250;
                Thickness.gsb = 380;
            } else if (msa >= 150) {
                Thickness.total = 890;
                Thickness.ac = 50;
                Thickness.dbm = 210;
                Thickness.wbm = 250;
                Thickness.gsb = 380;
            } else {
            }
        } else if (cbr == 4) {
            if (msa == 1) {
                Thickness.total = 480;
                Thickness.ac = 20;
                Thickness.dbm = 1;
                Thickness.wbm = 225;
                Thickness.gsb = 255;
            } else if (msa == 2) {
                Thickness.total = 540;
                Thickness.ac = 20;
                Thickness.dbm = 50;
                Thickness.wbm = 225;
                Thickness.gsb = 265;
            } else if (msa == 3) {
                Thickness.total = 580;
                Thickness.ac = 20;
                Thickness.dbm = 50;
                Thickness.wbm = 250;
                Thickness.gsb = 280;
            } else if (msa == 4) {
                Thickness.total = 600;
                Thickness.ac = 20;
                Thickness.dbm = 50;
                Thickness.wbm = 250;
                Thickness.gsb = 280;
            } else if (msa == 5) {
                Thickness.total = 620;
                Thickness.ac = 25;
                Thickness.dbm = 50;
                Thickness.wbm = 250;
                Thickness.gsb = 285;
            } else if (msa == 6) {
                Thickness.total = 630;
                Thickness.ac = 40;
                Thickness.dbm = 60;
                Thickness.wbm = 250;
                Thickness.gsb = 290;
            } else if (msa == 7) {
                Thickness.total = 640;
                Thickness.ac = 40;
                Thickness.dbm = 70;
                Thickness.wbm = 250;
                Thickness.gsb = 300;
            } else if (msa == 8) {
                Thickness.total = 660;
                Thickness.ac = 40;
                Thickness.dbm = 70;
                Thickness.wbm = 250;
                Thickness.gsb = 310;
            } else if (msa == 9) {
                Thickness.total = 680;
                Thickness.ac = 40;
                Thickness.dbm = 80;
                Thickness.wbm = 250;
                Thickness.gsb = 320;
            } else if (msa < 20 && msa >= 10) {
                Thickness.total = 700;
                Thickness.ac = 40;
                Thickness.dbm = 80;
                Thickness.wbm = 250;
                Thickness.gsb = 330;
            } else if (msa < 30 && msa >= 20) {
                Thickness.total = 730;
                Thickness.ac = 40;
                Thickness.dbm = 110;
                Thickness.wbm = 250;
                Thickness.gsb = 330;
            } else if (msa < 50 && msa >= 30) {
                Thickness.total = 750;
                Thickness.ac = 40;
                Thickness.dbm = 130;
                Thickness.wbm = 250;
                Thickness.gsb = 330;
            } else if (msa < 100 && msa >= 50) {
                Thickness.total = 780;
                Thickness.ac = 40;
                Thickness.dbm = 160;
                Thickness.wbm = 250;
                Thickness.gsb = 330;
            } else if (msa < 150 && msa >= 100) {
                Thickness.total = 800;
                Thickness.ac = 50;
                Thickness.dbm = 170;
                Thickness.wbm = 250;
                Thickness.gsb = 330;
            } else if (msa >= 150) {
                Thickness.total = 820;
                Thickness.ac = 50;
                Thickness.dbm = 190;
                Thickness.wbm = 250;
                Thickness.gsb = 330;
            } else {
            }
        } else if (cbr == 5) {
            if (msa == 1) {
                Thickness.total = 430;
                Thickness.ac = 20;
                Thickness.dbm = 1;
                Thickness.wbm = 225;
                Thickness.gsb = 205;
            } else if (msa == 2) {
                Thickness.total = 490;
                Thickness.ac = 20;
                Thickness.dbm = 50;
                Thickness.wbm = 225;
                Thickness.gsb = 215;
            } else if (msa == 3) {
                Thickness.total = 530;
                Thickness.ac = 20;
                Thickness.dbm = 50;
                Thickness.wbm = 250;
                Thickness.gsb = 230;
            } else if (msa == 4) {
                Thickness.total = 550;
                Thickness.ac = 20;
                Thickness.dbm = 50;
                Thickness.wbm = 250;
                Thickness.gsb = 240;
            } else if (msa == 5) {
                Thickness.total = 580;
                Thickness.ac = 25;
                Thickness.dbm = 55;
                Thickness.wbm = 250;
                Thickness.gsb = 250;
            } else if (msa == 6) {
                Thickness.total = 590;
                Thickness.ac = 40;
                Thickness.dbm = 60;
                Thickness.wbm = 250;
                Thickness.gsb = 260;
            } else if (msa == 7) {
                Thickness.total = 600;
                Thickness.ac = 40;
                Thickness.dbm = 60;
                Thickness.wbm = 250;
                Thickness.gsb = 270;
            } else if (msa == 8) {
                Thickness.total = 620;
                Thickness.ac = 40;
                Thickness.dbm = 65;
                Thickness.wbm = 250;
                Thickness.gsb = 280;
            } else if (msa == 9) {
                Thickness.total = 640;
                Thickness.ac = 40;
                Thickness.dbm = 70;
                Thickness.wbm = 250;
                Thickness.gsb = 290;
            } else if (msa < 20 && msa >= 10) {
                Thickness.total = 660;
                Thickness.ac = 40;
                Thickness.dbm = 70;
                Thickness.wbm = 250;
                Thickness.gsb = 300;
            } else if (msa < 30 && msa >= 20) {
                Thickness.total = 690;
                Thickness.ac = 40;
                Thickness.dbm = 100;
                Thickness.wbm = 250;
                Thickness.gsb = 300;
            } else if (msa < 50 && msa >= 30) {
                Thickness.total = 710;
                Thickness.ac = 40;
                Thickness.dbm = 120;
                Thickness.wbm = 250;
                Thickness.gsb = 300;
            } else if (msa < 100 && msa >= 50) {
                Thickness.total = 730;
                Thickness.ac = 40;
                Thickness.dbm = 140;
                Thickness.wbm = 250;
                Thickness.gsb = 300;
            } else if (msa < 150 && msa >= 100) {
                Thickness.total = 750;
                Thickness.ac = 50;
                Thickness.dbm = 150;
                Thickness.wbm = 250;
                Thickness.gsb = 300;
            } else if (msa >= 150) {
                Thickness.total = 770;
                Thickness.ac = 50;
                Thickness.dbm = 170;
                Thickness.wbm = 250;
                Thickness.gsb = 300;
            } else {
            }
        } else if (cbr == 6) {
            if (msa == 1) {
                Thickness.total = 390;
                Thickness.ac = 20;
                Thickness.dbm = 1;
                Thickness.wbm = 225;
                Thickness.gsb = 165;
            } else if (msa == 2) {
                Thickness.total = 450;
                Thickness.ac = 20;
                Thickness.dbm = 50;
                Thickness.wbm = 225;
                Thickness.gsb = 175;
            } else if (msa == 3) {
                Thickness.total = 490;
                Thickness.ac = 20;
                Thickness.dbm = 50;
                Thickness.wbm = 250;
                Thickness.gsb = 190;
            } else if (msa > 3 && msa <= 5) {
                Thickness.total = 535;
                Thickness.ac = 25;
                Thickness.dbm = 50;
                Thickness.wbm = 250;
                Thickness.gsb = 210;
            } else if (msa > 5 && msa <= 10) {
                Thickness.total = 615;
                Thickness.ac = 40;
                Thickness.dbm = 60;
                Thickness.wbm = 250;
                Thickness.gsb = 260;
            } else if (msa > 10 && msa <= 20) {
                Thickness.total = 640;
                Thickness.ac = 40;
                Thickness.dbm = 65;
                Thickness.wbm = 250;
                Thickness.gsb = 260;
            } else if (msa > 20 && msa <= 30) {
                Thickness.total = 655;
                Thickness.ac = 40;
                Thickness.dbm = 105;
                Thickness.wbm = 250;
                Thickness.gsb = 260;
            } else if (msa > 30 && msa <= 50) {
                Thickness.total = 675;
                Thickness.ac = 40;
                Thickness.dbm = 125;
                Thickness.wbm = 250;
                Thickness.gsb = 260;
            } else if (msa > 50 && msa <= 100) {
                Thickness.total = 700;
                Thickness.ac = 50;
                Thickness.dbm = 140;
                Thickness.wbm = 250;
                Thickness.gsb = 260;
            } else if (msa > 100 && msa <= 150) {
                Thickness.total = 720;
                Thickness.ac = 50;
                Thickness.dbm = 160;
                Thickness.wbm = 250;
                Thickness.gsb = 260;
            } else {
            }
        } else if (cbr == 7) {
            if (msa == 1) {
                Thickness.total = 375;
                Thickness.ac = 20;
                Thickness.dbm = 1;
                Thickness.wbm = 225;
                Thickness.gsb = 150;
            } else if (msa == 2) {
                Thickness.total = 425;
                Thickness.ac = 20;
                Thickness.dbm = 50;
                Thickness.wbm = 225;
                Thickness.gsb = 150;
            } else if (msa == 3) {
                Thickness.total = 460;
                Thickness.ac = 20;
                Thickness.dbm = 50;
                Thickness.wbm = 250;
                Thickness.gsb = 160;
            } else if (msa > 3 && msa <= 5) {
                Thickness.total = 505;
                Thickness.ac = 25;
                Thickness.dbm = 50;
                Thickness.wbm = 250;
                Thickness.gsb = 180;
            } else if (msa > 5 && msa <= 10) {
                Thickness.total = 580;
                Thickness.ac = 40;
                Thickness.dbm = 60;
                Thickness.wbm = 250;
                Thickness.gsb = 230;
            } else if (msa > 10 && msa <= 20) {
                Thickness.total = 610;
                Thickness.ac = 40;
                Thickness.dbm = 90;
                Thickness.wbm = 250;
                Thickness.gsb = 230;
            } else if (msa > 20 && msa <= 30) {
                Thickness.total = 630;
                Thickness.ac = 40;
                Thickness.dbm = 110;
                Thickness.wbm = 250;
                Thickness.gsb = 230;
            } else if (msa > 30 && msa <= 50) {
                Thickness.total = 650;
                Thickness.ac = 40;
                Thickness.dbm = 130;
                Thickness.wbm = 250;
                Thickness.gsb = 230;
            } else if (msa > 50 && msa <= 100) {
                Thickness.total = 675;
                Thickness.ac = 50;
                Thickness.dbm = 145;
                Thickness.wbm = 250;
                Thickness.gsb = 230;
            } else if (msa > 100 && msa <= 150) {
                Thickness.total = 695;
                Thickness.ac = 50;
                Thickness.dbm = 165;
                Thickness.wbm = 250;
                Thickness.gsb = 230;
            } else {
            }
        } else if (cbr == 8) {
            if (msa == 1) {
                Thickness.total = 375;
                Thickness.ac = 20;
                Thickness.dbm = 1;
                Thickness.wbm = 225;
                Thickness.gsb = 150;
            } else if (msa == 2) {
                Thickness.total = 425;
                Thickness.ac = 20;
                Thickness.dbm = 50;
                Thickness.wbm = 225;
                Thickness.gsb = 150;
            } else if (msa == 3) {
                Thickness.total = 450;
                Thickness.ac = 20;
                Thickness.dbm = 50;
                Thickness.wbm = 250;
                Thickness.gsb = 150;
            } else if (msa > 3 && msa <= 5) {
                Thickness.total = 475;
                Thickness.ac = 25;
                Thickness.dbm = 50;
                Thickness.wbm = 250;
                Thickness.gsb = 150;
            } else if (msa > 5 && msa <= 10) {
                Thickness.total = 550;
                Thickness.ac = 40;
                Thickness.dbm = 60;
                Thickness.wbm = 250;
                Thickness.gsb = 200;
            } else if (msa > 10 && msa <= 20) {
                Thickness.total = 575;
                Thickness.ac = 40;
                Thickness.dbm = 85;
                Thickness.wbm = 250;
                Thickness.gsb = 230;
            } else if (msa > 20 && msa <= 30) {
                Thickness.total = 590;
                Thickness.ac = 40;
                Thickness.dbm = 100;
                Thickness.wbm = 250;
                Thickness.gsb = 200;
            } else if (msa > 30 && msa <= 50) {
                Thickness.total = 610;
                Thickness.ac = 40;
                Thickness.dbm = 120;
                Thickness.wbm = 250;
                Thickness.gsb = 200;
            } else if (msa > 50 && msa <= 100) {
                Thickness.total = 640;
                Thickness.ac = 50;
                Thickness.dbm = 140;
                Thickness.wbm = 250;
                Thickness.gsb = 200;
            } else if (msa > 100 && msa <= 150) {
                Thickness.total = 660;
                Thickness.ac = 50;
                Thickness.dbm = 160;
                Thickness.wbm = 250;
                Thickness.gsb = 200;
            } else {
            }
        } else if (cbr == 9) {
            if (msa == 1) {
                Thickness.total = 375;
                Thickness.ac = 20;
                Thickness.dbm = 1;
                Thickness.wbm = 225;
                Thickness.gsb = 150;
            } else if (msa == 2) {
                Thickness.total = 425;
                Thickness.ac = 20;
                Thickness.dbm = 50;
                Thickness.wbm = 225;
                Thickness.gsb = 150;
            } else if (msa == 3) {
                Thickness.total = 450;
                Thickness.ac = 20;
                Thickness.dbm = 50;
                Thickness.wbm = 250;
                Thickness.gsb = 150;
            } else if (msa > 3 && msa <= 5) {
                Thickness.total = 475;
                Thickness.ac = 25;
                Thickness.dbm = 50;
                Thickness.wbm = 250;
                Thickness.gsb = 150;
            } else if (msa > 5 && msa <= 10) {
                Thickness.total = 540;
                Thickness.ac = 40;
                Thickness.dbm = 50;
                Thickness.wbm = 250;
                Thickness.gsb = 200;
            } else if (msa > 10 && msa <= 20) {
                Thickness.total = 570;
                Thickness.ac = 40;
                Thickness.dbm = 80;
                Thickness.wbm = 250;
                Thickness.gsb = 200;
            } else if (msa > 20 && msa <= 30) {
                Thickness.total = 585;
                Thickness.ac = 40;
                Thickness.dbm = 95;
                Thickness.wbm = 250;
                Thickness.gsb = 200;
            } else if (msa > 30 && msa <= 50) {
                Thickness.total = 605;
                Thickness.ac = 40;
                Thickness.dbm = 115;
                Thickness.wbm = 250;
                Thickness.gsb = 200;
            } else if (msa > 50 && msa <= 100) {
                Thickness.total = 635;
                Thickness.ac = 50;
                Thickness.dbm = 135;
                Thickness.wbm = 250;
                Thickness.gsb = 200;
            } else if (msa > 100 && msa <= 150) {
                Thickness.total = 655;
                Thickness.ac = 50;
                Thickness.dbm = 155;
                Thickness.wbm = 250;
                Thickness.gsb = 200;
            } else {
            }
        } else if (cbr == 10) {
            if (msa == 1) {
                Thickness.total = 375;
                Thickness.ac = 20;
                Thickness.dbm = 1;
                Thickness.wbm = 225;
                Thickness.gsb = 150;
            } else if (msa == 2) {
                Thickness.total = 425;
                Thickness.ac = 20;
                Thickness.dbm = 50;
                Thickness.wbm = 225;
                Thickness.gsb = 150;
            } else if (msa == 3) {
                Thickness.total = 450;
                Thickness.ac = 20;
                Thickness.dbm = 50;
                Thickness.wbm = 250;
                Thickness.gsb = 150;
            } else if (msa > 3 && msa <= 5) {
                Thickness.total = 475;
                Thickness.ac = 25;
                Thickness.dbm = 50;
                Thickness.wbm = 250;
                Thickness.gsb = 150;
            } else if (msa > 5 && msa <= 10) {
                Thickness.total = 540;
                Thickness.ac = 40;
                Thickness.dbm = 50;
                Thickness.wbm = 250;
                Thickness.gsb = 200;
            } else if (msa > 10 && msa <= 20) {
                Thickness.total = 565;
                Thickness.ac = 40;
                Thickness.dbm = 75;
                Thickness.wbm = 250;
                Thickness.gsb = 200;
            } else if (msa > 20 && msa <= 30) {
                Thickness.total = 580;
                Thickness.ac = 40;
                Thickness.dbm = 90;
                Thickness.wbm = 250;
                Thickness.gsb = 200;
            } else if (msa > 30 && msa <= 50) {
                Thickness.total = 600;
                Thickness.ac = 40;
                Thickness.dbm = 110;
                Thickness.wbm = 250;
                Thickness.gsb = 200;
            } else if (msa > 50 && msa <= 100) {
                Thickness.total = 630;
                Thickness.ac = 50;
                Thickness.dbm = 130;
                Thickness.wbm = 250;
                Thickness.gsb = 200;
            } else if (msa > 100 && msa <= 150) {
                Thickness.total = 650;
                Thickness.ac = 50;
                Thickness.dbm = 150;
                Thickness.wbm = 250;
                Thickness.gsb = 200;
            } else {
            }
        } else {
        }





    }
}
