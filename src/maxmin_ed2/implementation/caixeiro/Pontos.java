package maxmin_ed2.implementation.caixeiro;

import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class Pontos extends JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int[][] coordenadas;// guardar as coordenadas x e y de cada ponto 
    private double[][] custos;// objetivo mostrar a distancia de uma cidade para qualquer outro cidade
    private int vertices;
    private int largura;
    private int altura;

    
    public int[][] getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(int[][] coordenadas) {
        this.coordenadas = coordenadas;
    }

    public double[][] getCustos() {
        return custos;
    }

    public void setCustos(double[][] custos) {
        this.custos = custos;
    }

    public int getVertices() {
        return vertices;
    }

    public void setVertices(int vertices) {
        this.vertices = vertices;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        //Plotando todos os vertices gerando aleatoriamente
        int x,y;
        for(int i = 0; i< this.vertices; i++){
            x = this.coordenadas[i][0];
            y = this.coordenadas[i][1];
            g.fillOval(x, y, 7, 7);
            
        }
        // traçando uma linha reta unindo todos os pontos 
        int x1, x2, y1, y2;
        
       for( int i= 0 ; i < this.vertices; i ++){
            for (int j = 0 ; j < this.vertices; j++){
               if(i!= j){
                
                    x1 = this.coordenadas[i][0];
                    x2 = this.coordenadas[j][0];


                    y1 = this.coordenadas[i][1];
                    y2 = this.coordenadas[j][1]; 
                    
                    g.drawLine(x1, y1, x2, y2);
                    
               }
                
            }
            
        }
    }
    
     public Pontos(int vertices, int largura, int altura) {
        this.vertices = vertices;
        this.largura = largura;
        this.altura = altura;
        
        this.coordenadas = new int[vertices][2];
        this.custos = new double[vertices][vertices];
        gerar_vertices();
        CalculaCustos();
    }
    
    private void gerar_vertices(){
        Random r = new Random();
        
        //Gerando todos os vértices
        int x,y;
        for(int i=0;i<this.vertices; i++){
            x = r.nextInt(this.largura);
            y = r.nextInt(this.altura);
            
            this.coordenadas[i][0] = x;
            this.coordenadas[i][1] = y;
        }
    }
   
    
    private void CalculaCustos(){
        
        double a, b, h, x1, y1 , x2, y2;
        
        for( int i= 0 ; i < this.vertices; i ++){
            for (int j = 0 ; j < this.vertices; j++){
                x1 = this.coordenadas[i][0];
                x2 = this.coordenadas[j][0];
   
                
                y1 = this.coordenadas[i][1];
                y2 = this.coordenadas[j][1];
                
                a = Math.abs(x2 -x1);
                b = Math.abs(y2 - y1);
                
                h  = Math.sqrt( a * a + b * b);
                
                this.custos[i][j] = h;
                
                
            }
        }
    }
    
}