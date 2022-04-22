package br.com.everson.payrollapi.resources;

import br.com.everson.payrollapi.domain.Payroll;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/api/payments")
public class PyrollResource {

    @GetMapping("/{workerId}")
    public ResponseEntity<Payroll> getPayment(@PathVariable Long workerId, @RequestBody Payroll payment){
        return ResponseEntity.ok().body(
                new Payroll(
                        "Everson",
                        payment.getDescription(),
                        payment.getHourlyPrice(),
                        300.0,
                        payment.getHourlyPrice() * payment.getWorkedHours()

                )
        );
    }
}
