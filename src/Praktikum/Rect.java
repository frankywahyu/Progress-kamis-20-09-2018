/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author ASUS
 */
public class Rect {
    //ada 4 variabel utama yang menentukan titik sudut persegi panjang
    public int x1,x2,y1,y2;
    
    //ini adalah constructor utama
    public Rect(int x1,int x2, int y1,int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    //constructor dengan panjang dan lebar dimulai dari kordinat 0,0
    public Rect(int width,int height){
        this(0,0,width,height);
    }
    //constructor persegi no1
    public Rect(){
        this(0,0,0,0);
    }
    //Method untuk mengetahui perpotongan dua persegi panjang
    public void move(int deltax,int deltay){
        x1 += deltay; x2 += deltay;
        y1 += deltay; y2 += deltay;
        
    }
    public boolean isInside(int x,int y){
        return((x >= x1) && (x <= x2) && (y >= y1) && (y <= y2));
    }
    public Rect union (Rect r){
        return new Rect(
                (this.x1 < r.x1)? this.x1 : r.x1,
                (this.y1 < r.y1)? this.y1 : r.y1,
                (this.x2 > r.x2)? this.x2 : r.x2,
                (this.y2 > r.y2)? this.y2 : r.y2);
    }
    //method untuk menggabung (union) persegi panjang
    public Rect intersection(Rect r){
        Rect result = new Rect(
                (this.x1 > r.x1)? this.x1 : r.x1,
                (this.y1 > r.y1)? this.y1 : r.y1,
                (this.x2 < r.x2)? this.x2 : r.x2,
                (this.y2 < r.y2)? this.y2 : r.y2
        );
        if (result.x1 > result.x2) {
            result.x1 = result.x2 = 0;
        }
        if(result.y1 > result.y2) {
            result.y1 = result.y2 = 0;
        }
        return result;
    }
}
