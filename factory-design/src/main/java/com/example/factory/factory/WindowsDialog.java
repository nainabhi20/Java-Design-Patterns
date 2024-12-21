package com.example.factory.factory;

import com.example.factory.buttons.*;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowButton();
    }
}