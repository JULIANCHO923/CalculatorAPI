package com.devops.CalculatorAPI.controler;
import com.devops.CalculatorAPI.model.Operations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.net.InetAddress;

@RestController
@RequestMapping("/operations")
public class OperationsController {

    @Autowired
    Operations calculator;

    @RequestMapping(value="/addition/{n1}/{n2}",method = RequestMethod.GET)
    private ResponseEntity<String> addition(@PathVariable("n1") double n1,@PathVariable("n2") double n2){
        return ResponseEntity.status(200).body("<html><body><title>addition</title>The addition between "+n1+"+"+n2+" = "+ calculator.addition(n1,n2) +"</body></html>");
    }
    @RequestMapping(value="/substraction/{n1}/{n2}",method = RequestMethod.GET)
    public ResponseEntity<String> substraction(@PathVariable("n1") double n1,@PathVariable("n2") double n2){
        return ResponseEntity.status(200).body("<html><body><title>substraction</title>The substraction between "+ n1 + "-" + n2 + " = " + calculator.substraction(n1,n2) + "</body></html>");
    }
    @RequestMapping(value="/multiplication/{n1}/{n2}",method = RequestMethod.GET)
    public ResponseEntity<String> multiplication(@PathVariable("n1") double n1,@PathVariable("n2") double n2){
        return ResponseEntity.status(200).body("<html><body><title>multiplication</title>The multiplication between "+ n1 + "*" + n2 + " = " + calculator.multiplication(n1,n2) + "</body></html>");
    }
    @RequestMapping(value="/division/{n1}/{n2}",method = RequestMethod.GET)
    public ResponseEntity<String> division(@PathVariable("n1") double n1,@PathVariable("n2") double n2){
        return ResponseEntity.status(200).body("<html><body><title>division</title>The division between "+ n1 + "/" + n2 + " = " + calculator.division(n1,n2) + "</body></html>");    
}
}
