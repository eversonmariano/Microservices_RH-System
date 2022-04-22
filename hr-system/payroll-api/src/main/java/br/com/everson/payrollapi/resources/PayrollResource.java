package br.com.everson.payrollapi.resources;

import br.com.everson.payrollapi.domain.Payroll;
import br.com.everson.payrollapi.services.PayroollService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/payments")
public class PayrollResource {

    private final PayroollService service;

    @GetMapping(value = "/{workerId}")
    public ResponseEntity<Payroll> getPayment(@PathVariable Long workerId, @RequestBody Payroll payment) {
        return ResponseEntity.ok().body(service.getPayment(workerId, payment));


    }


}
