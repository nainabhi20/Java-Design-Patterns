package com.example.factory.factory;

import com.example.factory.buttons.*;


public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HTMLButton();
    }
    
}
