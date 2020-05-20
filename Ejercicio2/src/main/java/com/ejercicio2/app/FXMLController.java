package com.ejercicio2.app;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;


public class FXMLController implements Initializable {

    @FXML
    Button excel_profB, excel_matB, excel_dispB, excel_pondB;
    @FXML
    Button txt_profB, txt_matB, txt_dispB, txt_pondB;
    @FXML
    Button ver_profB, ver_matB, ver_dispB, ver_pondB;
    @FXML
    Label estado_prof, estado_mat, estado_disp, estado_pond;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub

    }
    //Variables globales
    String rutaProf, rutaMat, rutaDisp, rutaPond;
    Scanner entrada = null;


    public void excel_prof(){
        estado_prof.setTextFill(Color.BLACK);
        estado_prof.setText("Sin cargar");
        ver_profB.setVisible(false);


        JFileChooser fileChooser = new JFileChooser();
        FileFilter filter = new FileNameExtensionFilter("Archivo de excel", "xlsx");
        fileChooser.setFileFilter(filter);

        fileChooser.showOpenDialog(fileChooser);
        try {
            rutaProf = fileChooser.getSelectedFile().getAbsolutePath();
            File f = new File(rutaProf);
            entrada = new Scanner(f);
            while (entrada.hasNext()) {
                System.out.println(entrada.nextLine());
            }
            extensionXLSX(rutaProf);
            estado_prof.setTextFill(Color.GREEN);
            estado_prof.setText("Cargado");
            ver_profB.setVisible(true);


        } catch (ExcepcionTipoDeArchivoXLSX e) {
            JOptionPane.showMessageDialog(null, "Tipo de archivo incorrecto");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se encontró el archivo");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No se seleccionó ningun archivo");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error: "+e);
        } finally {
            if (entrada != null) {
                entrada.close();
            }
        }
    }

    public void txt_prof(){
        estado_prof.setTextFill(Color.BLACK);
        estado_prof.setText("Sin cargar");
        ver_profB.setVisible(false);

        JFileChooser fileChooser = new JFileChooser();
        FileFilter filter = new FileNameExtensionFilter("Archivo de texto", "txt");
        fileChooser.setFileFilter(filter);

        fileChooser.showOpenDialog(fileChooser);
        try {
            rutaProf = fileChooser.getSelectedFile().getAbsolutePath();
            File f = new File(rutaProf);
            entrada = new Scanner(f);
            while (entrada.hasNext()) {
                System.out.println(entrada.nextLine());
            }
            extensionTXT(rutaProf);
            estado_prof.setTextFill(Color.GREEN);
            estado_prof.setText("Cargado");
            ver_profB.setVisible(true);


        } catch (ExcepcionTipoDeArchivoTXT e) {
            JOptionPane.showMessageDialog(null, "Tipo de archivo incorrecto");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se encontró el archivo");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No se seleccionó ningun archivo");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error: "+e);
        } finally {
            if (entrada != null) {
                entrada.close();
            }
        }
    }

    public void ver_prof(){
        try{
            System.out.println("Dir: "+rutaProf);
            JOptionPane.showMessageDialog(null, "Directorio: "+rutaProf);
        }catch(Exception e){
            System.out.println("Error: "+e);
        }

    }

    public void excel_mat(){
        estado_mat.setTextFill(Color.BLACK);
        estado_mat.setText("Sin cargar");
        ver_matB.setVisible(false);


        JFileChooser fileChooser = new JFileChooser();
        FileFilter filter = new FileNameExtensionFilter("Archivo de excel", "xlsx");
        fileChooser.setFileFilter(filter);

        fileChooser.showOpenDialog(fileChooser);
        try {
            rutaMat = fileChooser.getSelectedFile().getAbsolutePath();
            File f = new File(rutaMat);
            entrada = new Scanner(f);
            while (entrada.hasNext()) {
                System.out.println(entrada.nextLine());
            }
            extensionXLSX(rutaMat);
            estado_mat.setTextFill(Color.GREEN);
            estado_mat.setText("Cargado");
            ver_matB.setVisible(true);


        } catch (ExcepcionTipoDeArchivoXLSX e) {
            JOptionPane.showMessageDialog(null, "Tipo de archivo incorrecto");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se encontró el archivo");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No se seleccionó ningun archivo");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error: "+e);
        } finally {
            if (entrada != null) {
                entrada.close();
            }
        }
    }

    public void txt_mat(){
        estado_mat.setTextFill(Color.BLACK);
        estado_mat.setText("Sin cargar");
        ver_matB.setVisible(false);

        JFileChooser fileChooser = new JFileChooser();
        FileFilter filter = new FileNameExtensionFilter("Archivo de texto", "txt");
        fileChooser.setFileFilter(filter);

        fileChooser.showOpenDialog(fileChooser);
        try {
            rutaMat = fileChooser.getSelectedFile().getAbsolutePath();
            File f = new File(rutaMat);
            entrada = new Scanner(f);
            while (entrada.hasNext()) {
                System.out.println(entrada.nextLine());
            }
            extensionTXT(rutaMat);
            estado_mat.setTextFill(Color.GREEN);
            estado_mat.setText("Cargado");
            ver_matB.setVisible(true);


        } catch (ExcepcionTipoDeArchivoTXT e) {
            JOptionPane.showMessageDialog(null, "Tipo de archivo incorrecto");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se encontró el archivo");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No se seleccionó ningun archivo");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error: "+e);
        } finally {
            if (entrada != null) {
                entrada.close();
            }
        }
    }

    public void ver_mat(){
        try{
            System.out.println("Dir: "+rutaMat);
            JOptionPane.showMessageDialog(null, "Directorio: "+rutaMat);
        }catch(Exception e){
            System.out.println("Error: "+e);
        }

    }

    public void excel_disp(){
        estado_disp.setTextFill(Color.BLACK);
        estado_disp.setText("Sin cargar");
        ver_dispB.setVisible(false);


        JFileChooser fileChooser = new JFileChooser();
        FileFilter filter = new FileNameExtensionFilter("Archivo de excel", "xlsx");
        fileChooser.setFileFilter(filter);

        fileChooser.showOpenDialog(fileChooser);
        try {
            rutaDisp = fileChooser.getSelectedFile().getAbsolutePath();
            File f = new File(rutaDisp);
            entrada = new Scanner(f);
            while (entrada.hasNext()) {
                System.out.println(entrada.nextLine());
            }
            extensionXLSX(rutaDisp);
            estado_disp.setTextFill(Color.GREEN);
            estado_disp.setText("Cargado");
            ver_dispB.setVisible(true);


        } catch (ExcepcionTipoDeArchivoXLSX e) {
            JOptionPane.showMessageDialog(null, "Tipo de archivo incorrecto");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se encontró el archivo");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No se seleccionó ningun archivo");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error: "+e);
        } finally {
            if (entrada != null) {
                entrada.close();
            }
        }
    }

    public void txt_disp(){
        estado_disp.setTextFill(Color.BLACK);
        estado_disp.setText("Sin cargar");
        ver_dispB.setVisible(false);

        JFileChooser fileChooser = new JFileChooser();
        FileFilter filter = new FileNameExtensionFilter("Archivo de texto", "txt");
        fileChooser.setFileFilter(filter);

        fileChooser.showOpenDialog(fileChooser);
        try {
            rutaDisp = fileChooser.getSelectedFile().getAbsolutePath();
            File f = new File(rutaDisp);
            entrada = new Scanner(f);
            while (entrada.hasNext()) {
                System.out.println(entrada.nextLine());
            }
            extensionTXT(rutaDisp);
            estado_disp.setTextFill(Color.GREEN);
            estado_disp.setText("Cargado");
            ver_dispB.setVisible(true);


        } catch (ExcepcionTipoDeArchivoTXT e) {
            JOptionPane.showMessageDialog(null, "Tipo de archivo incorrecto");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se encontró el archivo");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No se seleccionó ningun archivo");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error: "+e);
        } finally {
            if (entrada != null) {
                entrada.close();
            }
        }
    }

    public void ver_disp(){
        try{
            System.out.println("Dir: "+rutaDisp);
            JOptionPane.showMessageDialog(null, "Directorio: "+rutaDisp);
        }catch(Exception e){
            System.out.println("Error: "+e);
        }

    }

    public void excel_pond(){
        estado_pond.setTextFill(Color.BLACK);
        estado_pond.setText("Sin cargar");
        ver_pondB.setVisible(false);


        JFileChooser fileChooser = new JFileChooser();
        FileFilter filter = new FileNameExtensionFilter("Archivo de excel", "xlsx");
        fileChooser.setFileFilter(filter);

        fileChooser.showOpenDialog(fileChooser);
        try {
            rutaPond = fileChooser.getSelectedFile().getAbsolutePath();
            File f = new File(rutaPond);
            entrada = new Scanner(f);
            while (entrada.hasNext()) {
                System.out.println(entrada.nextLine());
            }
            extensionXLSX(rutaPond);
            estado_pond.setTextFill(Color.GREEN);
            estado_pond.setText("Cargado");
            ver_pondB.setVisible(true);


        } catch (ExcepcionTipoDeArchivoXLSX e) {
            JOptionPane.showMessageDialog(null, "Tipo de archivo incorrecto");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se encontró el archivo");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No se seleccionó ningun archivo");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error: "+e);
        } finally {
            if (entrada != null) {
                entrada.close();
            }
        }
    }

    public void txt_pond(){
        estado_pond.setTextFill(Color.BLACK);
        estado_pond.setText("Sin cargar");
        ver_pondB.setVisible(false);

        JFileChooser fileChooser = new JFileChooser();
        FileFilter filter = new FileNameExtensionFilter("Archivo de texto", "txt");
        fileChooser.setFileFilter(filter);

        fileChooser.showOpenDialog(fileChooser);
        try {
            rutaPond = fileChooser.getSelectedFile().getAbsolutePath();
            File f = new File(rutaPond);
            entrada = new Scanner(f);
            while (entrada.hasNext()) {
                System.out.println(entrada.nextLine());
            }
            extensionTXT(rutaPond);
            estado_pond.setTextFill(Color.GREEN);
            estado_pond.setText("Cargado");
            ver_pondB.setVisible(true);


        } catch (ExcepcionTipoDeArchivoTXT e) {
            JOptionPane.showMessageDialog(null, "Tipo de archivo incorrecto");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se encontró el archivo");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No se seleccionó ningun archivo");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error: "+e);
        } finally {
            if (entrada != null) {
                entrada.close();
            }
        }
    }

    public void ver_pond(){
        try{
            System.out.println("Dir: "+rutaPond);
            JOptionPane.showMessageDialog(null, "Directorio: "+rutaPond);
        }catch(Exception e){
            System.out.println("Error: "+e);
        }

    }



    static void extensionXLSX(String ruta)throws ExcepcionTipoDeArchivoXLSX{
        ruta=ruta.substring(ruta.length()-5,ruta.length());
        System.out.println(ruta);
        if(!ruta.equals(".xlsx")){
            throw new ExcepcionTipoDeArchivoXLSX("Tipo de archivo invalido");
        }

    }

    static void extensionTXT(String ruta)throws ExcepcionTipoDeArchivoTXT{
        ruta=ruta.substring(ruta.length()-4,ruta.length());
        System.out.println(ruta);
        if(!ruta.equals(".txt")){
            throw new ExcepcionTipoDeArchivoTXT("Tipo de archivo invalido");
        }

    }
}