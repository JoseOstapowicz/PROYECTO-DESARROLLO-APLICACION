package com.example.proyecto;


import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    // Método para comparar las cadenas
    public boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }
}
