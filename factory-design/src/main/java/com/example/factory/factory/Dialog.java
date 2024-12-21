package com.example.factory.factory;

import com.example.factory.buttons.Button;

abstract public class Dialog {
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }
    public abstract Button createButton();
}
