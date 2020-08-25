package com.example.myapplication.Clases;

import android.graphics.Bitmap;

import java.io.ByteArrayOutputStream;
import java.io.Serializable;

public class Imagen implements Serializable {
     String nombre, direccion, usuario;
     byte[] imageBitmap;

    public Imagen() {
    }

    public Imagen(String nombre, String direccion, String usuario, byte[] imageBitmap) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.usuario = usuario;
        this.imageBitmap = imageBitmap;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public byte[] getImageBitmap() {
        return imageBitmap;
    }

    public void setImageBitmap(byte[] imageBitmap) {
        this.imageBitmap = imageBitmap;
    }
}
