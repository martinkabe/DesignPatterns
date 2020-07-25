package com.codewithmartin.command;

import com.codewithmartin.command.fx.Button;

public class Main {
    public static void main(String[] args) {
        CustomerService service = new CustomerService();
        AddCustomerCommand command = new AddCustomerCommand(service);
        Button button = new Button(command);
        button.click();
    }
}
