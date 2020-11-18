package com.example.mislugares.datos;

import com.example.mislugares.modelo.Lugar;

public interface RepositorioLugares {
    Lugar elemento(int id); //Devuelve el elemento dado su id
    void aniade(Lugar lugar); //Añade el elemento indicado
    int nuevo(); //Añade un elemento en blanco y devuelve su id
    void borrar(int id); //ELimina un elemento con el id indicado
    int tamanio(); //Devuelve el numero de elementos
    void actualiza(int id, Lugar lugar); //Reemplaza un elemento
}
