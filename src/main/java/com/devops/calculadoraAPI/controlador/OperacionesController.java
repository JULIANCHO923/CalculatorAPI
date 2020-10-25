package com.devops.calculadoraAPI.controlador;
import com.devops.calculadoraAPI.modelo.Operaciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.net.InetAddress;

@RestController
@RequestMapping("/operaciones")
public class OperacionesController {

    @Autowired
    Operaciones calculadora;

    @RequestMapping(value="/suma/{n1}/{n2}",method = RequestMethod.GET)
    private ResponseEntity<Double> suma(@PathVariable("n1") double n1,@PathVariable("n2") double n2){
        return ResponseEntity.status(200).body("<html><body><title>suma</title>La suma entre "+n1+"+"+n2+" = "+ calculadora.suma(n1,n2) +"</body></html>");
    }
    @RequestMapping(value="/resta/{n1}/{n2}",method = RequestMethod.GET)
    public ResponseEntity<Double> resta(@PathVariable("n1") double n1,@PathVariable("n2") double n2){
        return ResponseEntity.status(200).body(("<html><body><title>resta</title>La resta entre "+ n1 + "-" + n2 + " = " + calculadora.resta(n1,n2) + "</body></html>");
    }
    @RequestMapping(value="/multiplicacion/{n1}/{n2}",method = RequestMethod.GET)
    public ResponseEntity<Double> multiplicacion(@PathVariable("n1") double n1,@PathVariable("n2") double n2){
        return ResponseEntity.status(200).body("<html><body><title>multiplicacion</title>La multiplicacion entre "+ n1 + "*" + n2 + " = " + calculadora.multiplicacion(n1,n2) + "</body></html>");
    }
    @RequestMapping(value="/division/{n1}/{n2}",method = RequestMethod.GET)
    public ResponseEntity<Double> division(@PathVariable("n1") double n1,@PathVariable("n2") double n2){
        return ResponseEntity.status(200).body("<html><body><title>division</title>La division entre "+ n1 + "/" + n2 + " = " + calculadora.division(n1,n2) + "</body></html>");    
}
}
