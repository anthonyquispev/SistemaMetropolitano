package entidades;

public class Rutas {

    //Número de estaciones: 38
    //Tipos de buses: 15
    public boolean[][][][] matriz = new boolean[15][38][2][2];

    public Rutas() {
        // BUS A
        matriz[0][0][0][0] = true;
        matriz[0][1][0][0] = true;
        matriz[0][2][0][0] = true;
        matriz[0][3][0][0] = true;
        matriz[0][4][0][0] = true;
        matriz[0][5][0][0] = true;
        matriz[0][6][0][0] = true;
        matriz[0][7][0][0] = true;
        matriz[0][8][0][0] = true;
        matriz[0][9][0][0] = true;
        matriz[0][10][0][0] = true;
        matriz[0][11][0][0] = true;
        matriz[0][12][0][0] = true;
        matriz[0][13][0][0] = true;
        matriz[0][14][0][0] = true;
        matriz[0][18][0][0] = true;
        matriz[0][0][1][0] = true;
        matriz[0][1][1][0] = true;
        matriz[0][2][1][0] = true;
        matriz[0][3][1][0] = true;
        matriz[0][4][1][0] = true;
        matriz[0][5][1][0] = true;
        matriz[0][6][1][0] = true;
        matriz[0][7][1][0] = true;
        matriz[0][8][1][0] = true;
        matriz[0][9][1][0] = true;
        matriz[0][10][1][0] = true;
        matriz[0][11][1][0] = true;
        matriz[0][12][1][0] = true;
        matriz[0][13][1][0] = true;
        matriz[0][14][1][0] = true;
        matriz[0][18][1][0] = true;

        //BUS B
        matriz[1][0][0][0] = true;
        matriz[1][1][0][0] = true;
        matriz[1][2][0][0] = true;
        matriz[1][3][0][0] = true;
        matriz[1][4][0][0] = true;
        matriz[1][5][0][0] = true;
        matriz[1][6][0][0] = true;
        matriz[1][7][0][0] = true;
        matriz[1][8][0][0] = true;
        matriz[1][9][0][0] = true;
        matriz[1][10][0][0] = true;
        matriz[1][16][0][0] = true;
        matriz[1][17][0][0] = true;
        matriz[1][18][0][0] = true;
        matriz[1][19][0][0] = true;
        matriz[1][20][0][0] = true;
        matriz[1][21][0][0] = true;
        matriz[1][22][0][0] = true;
        matriz[1][23][0][0] = true;
        matriz[1][24][0][0] = true;
        matriz[1][25][0][0] = true;
        matriz[1][26][0][0] = true;
        matriz[1][27][0][0] = true;
        matriz[1][28][0][0] = true;
        matriz[1][29][0][0] = true;
        matriz[1][30][0][0] = true;
        matriz[1][31][0][0] = true;
        matriz[1][32][0][0] = true;
        matriz[1][33][0][0] = true;
        matriz[1][34][0][0] = true;
        matriz[1][35][0][0] = true;
        matriz[1][36][0][0] = true;
        matriz[1][37][0][0] = true;
        matriz[1][0][1][0] = true;
        matriz[1][1][1][0] = true;
        matriz[1][2][1][0] = true;
        matriz[1][3][1][0] = true;
        matriz[1][4][1][0] = true;
        matriz[1][5][1][0] = true;
        matriz[1][6][1][0] = true;
        matriz[1][7][1][0] = true;
        matriz[1][8][1][0] = true;
        matriz[1][9][1][0] = true;
        matriz[1][10][1][0] = true;
        matriz[1][11][1][0] = true;
        matriz[1][16][1][0] = true;
        matriz[1][17][1][0] = true;
        matriz[1][18][1][0] = true;
        matriz[1][19][1][0] = true;
        matriz[1][20][1][0] = true;
        matriz[1][21][1][0] = true;
        matriz[1][22][1][0] = true;
        matriz[1][23][1][0] = true;
        matriz[1][24][1][0] = true;
        matriz[1][25][1][0] = true;
        matriz[1][26][1][0] = true;
        matriz[1][27][1][0] = true;
        matriz[1][28][1][0] = true;
        matriz[1][29][1][0] = true;
        matriz[1][30][1][0] = true;
        matriz[1][31][1][0] = true;
        matriz[1][32][1][0] = true;
        matriz[1][33][1][0] = true;
        matriz[1][34][1][0] = true;
        matriz[1][35][1][0] = true;
        matriz[1][36][1][0] = true;
        matriz[1][37][1][0] = true;

        //BUS C
        matriz[2][11][0][0] = true;
        matriz[2][12][0][0] = true;
        matriz[2][13][0][0] = true;
        matriz[2][14][0][0] = true;
        matriz[2][18][0][0] = true;
        matriz[2][19][0][0] = true;
        matriz[2][20][0][0] = true;
        matriz[2][21][0][0] = true;
        matriz[2][22][0][0] = true;
        matriz[2][23][0][0] = true;
        matriz[2][24][0][0] = true;
        matriz[2][25][0][0] = true;
        matriz[2][26][0][0] = true;
        matriz[2][27][0][0] = true;
        matriz[2][28][0][0] = true;
        matriz[2][29][0][0] = true;
        matriz[2][30][0][0] = true;
        matriz[2][31][0][0] = true;
        matriz[2][32][0][0] = true;
        matriz[2][33][0][0] = true;
        matriz[2][34][0][0] = true;
        matriz[2][35][0][0] = true;
        matriz[2][36][0][0] = true;
        matriz[2][37][0][0] = true;
        matriz[2][11][1][0] = true;
        matriz[2][12][1][0] = true;
        matriz[2][13][1][0] = true;
        matriz[2][14][1][0] = true;
        matriz[2][18][1][0] = true;
        matriz[2][19][1][0] = true;
        matriz[2][20][1][0] = true;
        matriz[2][21][1][0] = true;
        matriz[2][22][1][0] = true;
        matriz[2][23][1][0] = true;
        matriz[2][24][1][0] = true;
        matriz[2][25][1][0] = true;
        matriz[2][26][1][0] = true;
        matriz[2][27][1][0] = true;
        matriz[2][28][1][0] = true;
        matriz[2][29][1][0] = true;
        matriz[2][30][1][0] = true;
        matriz[2][31][1][0] = true;
        matriz[2][32][1][0] = true;
        matriz[2][33][1][0] = true;
        matriz[2][34][1][0] = true;
        matriz[2][35][1][0] = true;
        matriz[2][36][1][0] = true;
        matriz[2][37][1][0] = true;

        // BUD D
        matriz[3][0][0][0] = true;
        matriz[3][1][0][0] = true;
        matriz[3][2][0][0] = true;
        matriz[3][3][0][0] = true;
        matriz[3][4][0][0] = true;
        matriz[3][5][0][0] = true;
        matriz[3][6][0][0] = true;
        matriz[3][7][0][0] = true;
        matriz[3][8][0][0] = true;
        matriz[3][9][0][0] = true;
        matriz[3][15][0][0] = true;
        matriz[3][16][0][0] = true;
        matriz[3][17][0][0] = true;
        matriz[3][18][0][0] = true;
        matriz[3][0][1][0] = true;
        matriz[3][1][1][0] = true;
        matriz[3][2][1][0] = true;
        matriz[3][3][1][0] = true;
        matriz[3][4][1][0] = true;
        matriz[3][5][1][0] = true;
        matriz[3][6][1][0] = true;
        matriz[3][7][1][0] = true;
        matriz[3][8][1][0] = true;
        matriz[3][9][1][0] = true;
        matriz[3][15][1][0] = true;
        matriz[3][16][1][0] = true;
        matriz[3][17][1][0] = true;
        matriz[3][18][1][0] = true;

        //BUS EX1
        matriz[4][18][0][0] = true;
        matriz[4][19][0][0] = true;
        matriz[4][22][0][0] = true;
        matriz[4][23][0][0] = true;
        matriz[4][26][0][0] = true;
        matriz[4][29][0][0] = true;
        matriz[4][31][0][0] = true;
        matriz[4][32][0][0] = true;
        matriz[4][33][0][0] = true;
        matriz[4][34][0][0] = true;
        matriz[4][35][0][0] = true;
        matriz[4][36][0][0] = true;
        matriz[4][37][0][0] = true;
        matriz[4][18][1][0] = true;
        matriz[4][19][1][0] = true;
        matriz[4][22][1][0] = true;
        matriz[4][23][1][0] = true;
        matriz[4][26][1][0] = true;
        matriz[4][29][1][0] = true;
        matriz[4][31][1][0] = true;
        matriz[4][32][1][0] = true;
        matriz[4][33][1][0] = true;
        matriz[4][34][1][0] = true;
        matriz[4][35][1][0] = true;
        matriz[4][36][1][0] = true;
        matriz[4][37][1][0] = true;
        matriz[4][18][0][1] = true;
        matriz[4][19][0][1] = true;
        matriz[4][22][0][1] = true;
        matriz[4][23][0][1] = true;
        matriz[4][26][0][1] = true;
        matriz[4][27][0][1] = true;
        matriz[4][29][0][1] = true;
        matriz[4][31][0][1] = true;
        matriz[4][32][0][1] = true;
        matriz[4][33][0][1] = true;
        matriz[4][34][0][1] = true;
        matriz[4][35][0][1] = true;
        matriz[4][36][0][1] = true;
        matriz[4][37][0][1] = true;
        matriz[4][18][1][1] = true;
        matriz[4][19][1][1] = true;
        matriz[4][22][1][1] = true;
        matriz[4][26][1][1] = true;
        matriz[4][29][1][1] = true;
        matriz[4][31][1][1] = true;
        matriz[4][32][1][1] = true;
        matriz[4][33][1][1] = true;
        matriz[4][34][1][1] = true;
        matriz[4][35][1][1] = true;
        matriz[4][36][1][1] = true;
        matriz[4][37][1][1] = true;

        //BUS EX2
        matriz[5][0][0][0] = true;
        matriz[5][21][0][0] = true;
        matriz[5][22][0][0] = true;
        matriz[5][27][0][0] = true;
        matriz[5][29][0][0] = true;
        matriz[5][0][1][0] = true;
        matriz[5][1][1][0] = true;
        matriz[5][5][1][0] = true;
        matriz[5][8][1][0] = true;
        matriz[5][10][1][0] = true;
        matriz[5][17][1][0] = true;
        matriz[5][18][1][0] = true;
        matriz[5][22][1][0] = true;
        matriz[5][23][1][0] = true;
        matriz[5][26][1][0] = true;
        matriz[5][28][1][0] = true;
        matriz[5][30][1][0] = true;
        matriz[5][0][1][1] = true;
        matriz[5][21][1][1] = true;
        matriz[5][22][1][1] = true;
        matriz[5][27][1][1] = true;

        //BUS EX3
        matriz[6][0][0][0] = true;
        matriz[6][26][0][0] = true;
        matriz[6][28][0][0] = true;
        matriz[6][29][0][0] = true;
        matriz[6][0][1][0] = true;
        matriz[6][26][1][0] = true;
        matriz[6][28][1][0] = true;

        //BUS EX4
        matriz[7][0][0][0] = true;
        matriz[7][1][0][0] = true;
        matriz[7][5][0][0] = true;
        matriz[7][8][0][0] = true;
        matriz[7][10][0][0] = true;
        matriz[7][15][0][0] = true;
        matriz[7][17][0][0] = true;
        matriz[7][18][0][0] = true;
        matriz[7][22][0][0] = true;
        matriz[7][23][0][0] = true;
        matriz[7][26][0][0] = true;
        matriz[7][30][0][0] = true;
        matriz[7][0][1][0] = true;
        matriz[7][1][1][0] = true;
        matriz[7][5][1][0] = true;
        matriz[7][8][1][0] = true;
        matriz[7][10][1][0] = true;
        matriz[7][15][1][0] = true;
        matriz[7][17][1][0] = true;
        matriz[7][18][1][0] = true;
        matriz[7][22][1][0] = true;
        matriz[7][23][1][0] = true;
        matriz[7][26][1][0] = true;
        matriz[7][30][1][0] = true;

        //BUS EX5
        matriz[8][0][0][0] = true;
        matriz[8][3][0][0] = true;
        matriz[8][5][0][0] = true;
        matriz[8][8][0][0] = true;
        matriz[8][17][0][0] = true;
        matriz[8][18][0][0] = true;
        matriz[8][21][0][0] = true;
        matriz[8][22][0][0] = true;
        matriz[8][23][0][0] = true;
        matriz[8][26][0][0] = true;
        matriz[8][27][0][0] = true;
        matriz[8][30][0][0] = true;
        matriz[8][0][1][0] = true;
        matriz[8][3][1][0] = true;
        matriz[8][5][1][0] = true;
        matriz[8][7][1][0] = true;
        matriz[8][8][1][0] = true;
        matriz[8][10][1][0] = true;
        matriz[8][17][1][0] = true;
        matriz[8][18][1][0] = true;
        matriz[8][21][1][0] = true;
        matriz[8][22][1][0] = true;
        matriz[8][23][1][0] = true;
        matriz[8][26][1][0] = true;
        matriz[8][27][1][0] = true;
        matriz[8][30][1][0] = true;

        //BUS EX6
        matriz[9][1][0][0] = true;
        matriz[9][3][0][0] = true;
        matriz[9][18][0][0] = true;
        matriz[9][22][0][0] = true;
        matriz[9][23][0][0] = true;
        matriz[9][26][0][0] = true;
        matriz[9][28][0][0] = true;

        //BUS EX7
        matriz[10][5][0][0] = true;
        matriz[10][18][0][0] = true;
        matriz[10][22][0][0] = true;
        matriz[10][23][0][0] = true;
        matriz[10][26][0][0] = true;

        //BUS EX8
        matriz[11][1][0][0] = true;
        matriz[11][3][0][0] = true;
        matriz[11][5][0][0] = true;
        matriz[11][8][0][0] = true;
        matriz[11][10][0][0] = true;
        matriz[11][17][0][0] = true;
        matriz[11][18][0][0] = true;
        matriz[11][22][0][0] = true;
        matriz[11][23][0][0] = true;
        matriz[11][26][0][0] = true;
        matriz[11][28][0][0] = true;
        matriz[11][30][0][0] = true;
        matriz[11][1][1][0] = true;
        matriz[11][3][1][0] = true;
        matriz[11][5][1][0] = true;
        matriz[11][8][1][0] = true;
        matriz[11][10][1][0] = true;
        matriz[11][17][1][0] = true;
        matriz[11][18][1][0] = true;
        matriz[11][22][1][0] = true;
        matriz[11][23][1][0] = true;
        matriz[11][26][1][0] = true;
        matriz[11][28][1][0] = true;
        matriz[11][30][1][0] = true;

        //BUS EX9
        matriz[12][8][0][0] = true;
        matriz[12][10][0][0] = true;
        matriz[12][21][0][0] = true;
        matriz[12][23][0][0] = true;
        matriz[12][26][0][0] = true;
        matriz[12][28][0][0] = true;

        //BUS SX
        matriz[13][0][0][0] = true;
        matriz[13][23][0][0] = true;
        matriz[13][24][0][0] = true;
        matriz[13][27][0][0] = true;
        matriz[13][0][1][0] = true;
        matriz[13][23][1][0] = true;
        matriz[13][24][1][0] = true;

        //BUS SXN
        matriz[14][0][0][0] = true;
        matriz[14][15][0][0] = true;
        matriz[14][16][0][0] = true;
        matriz[14][17][0][0] = true;
        matriz[14][18][0][0] = true;
        
        matriz[14][0][1][0] = true;
        matriz[14][18][1][0] = true;
        
        matriz[14][0][0][1] = true;
        matriz[14][18][0][1] = true;
        
        matriz[14][0][1][1] = true;
        matriz[14][15][1][1] = true;
        matriz[14][16][1][1] = true;
        matriz[14][17][1][1] = true;
        matriz[14][18][1][1] = true;
    }

    public boolean[][][][] getMatriz() {
        return matriz;
    }

}
