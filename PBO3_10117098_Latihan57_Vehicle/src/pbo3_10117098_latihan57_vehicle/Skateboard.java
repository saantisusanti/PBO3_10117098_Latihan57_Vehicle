/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117098_latihan57_vehicle;

/**
 *
 * @author 
 * NAMA     : SANTI SUSANTI
 * KELAS    : PBO3
 * NIM      : 10117098
 * Deskripsi Program : program ini berisi program untuk menampilkan jenis 
 *                     sepeda dan spesifikasinya berdasarkan konsep inheritance
 */
public class Skateboard extends Vehicle{
    private double myBoardLength;

    public Skateboard() {
       
        setMyBrand("Ally Skate");
        setMyModel("Rocket");
        setMyBoardLength(54.5);

        System.out.println("\nSkateboard");
        System.out.println("Brand  : "+getMyBrand());
        System.out.println("Model  : "+getMyModel());
        System.out.println("Panjangnya Board: "+getMyBoardLength());
    }

    public double getMyBoardLength() {
        return myBoardLength;
    }

    public void setMyBoardLength(double myBoardLength) {
        this.myBoardLength = myBoardLength;
    }
}
