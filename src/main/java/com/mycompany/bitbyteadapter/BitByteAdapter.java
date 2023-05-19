/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bitbyteadapter;

/**
 *
 * @author alu10191634
 */
public class BitByteAdapter {

    public static void main(String[] args) {
       BitSpitter bitSpitter = new BitSpitter();
       BitToBytesAdapter adapter = new BitToBytesAdapter(bitSpitter);
       ByteEater byteEater = new ByteEater(adapter);
       byteEater.eatByte();
    }
}
