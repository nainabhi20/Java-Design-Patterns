package com.example.factory;

import com.example.factory.factory.Dialog;
import com.example.factory.factory.HtmlDialog;
import com.example.factory.factory.WindowsDialog;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Dialog dialog;
        boolean x = false;
        if(x) {
            dialog = new HtmlDialog();
        }else {
            dialog = new WindowsDialog();
        }
        dialog.renderWindow();

    }
}
