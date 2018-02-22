/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpi.practica.leedorArchivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danm
 */
public class leedorArchivo {

    public File validarPath(String path) {
        File validado = null;

        if (path != null && !path.equals("")) {
            validado = new File(path);
            if (!validado.isFile()) {
                validado = null;
            }
        }
        return validado;
    }

    public String convertirArchivo(String path) {

        File archivoValidado = validarPath(path);

        if (archivoValidado != null) {
            FileReader fr = null;
            BufferedReader br;
            try {
                fr = new FileReader(archivoValidado);
                br = new BufferedReader(fr);
                
                //acumular texto del archivo
                String cadena;
                System.out.println("IMPRIMIENDO ARCHIVO:");
                while ((cadena = br.readLine()) != null) {
                    System.out.println(cadena);
                }
                br.close();
                return cadena;
            } catch (IOException e) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, e);
                System.out.println("--- ERROR AL ABRIR/LEER EL ARCHIVO ------------");
            }catch (Exception e){
                 Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, e);
            }finally{
                try {
                    if(fr != null)
                    fr.close();
                } catch (IOException e) {
                    Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, e);
                }
            }

        } else {
            System.out.println("--- ARCHIVO INVALIDO/NO ENCONTRADO ----------");
        }
        return "";
    }

//        boolean salida = false;
//        FileReader f = null;
//        try {
//            f = new FileReader(file);
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
//        }
//        BufferedReader br = new BufferedReader(f);
//        try {
//            String cadena;
//            int i = 1;
//            while ((cadena = br.readLine()) != null) {
//                i = i + 1;
//                System.out.println(cadena);
//                if (!cadena.isEmpty()) {
//                    salida = true;
//                }
//            }
//
//        } catch (IOException ex) {
//            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
//        }
//        try {
//            br.close();
//        } catch (IOException ex) {
//            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            try {
//                f.close();
//            } catch (IOException ex) {
//                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//        return salida;

}
