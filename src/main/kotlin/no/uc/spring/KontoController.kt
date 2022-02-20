package no.uc.spring

import org.springframework.web.bind.annotation.*

@RestController
class KontoController(private val kontoService : KontoService) {

    @GetMapping("/konto")
    fun fetchKonto(): List<Konto> {
        return kontoService.getAllKonto()
    }

    @GetMapping("/konto/{id}")
    fun getKontoById(@PathVariable("id") kontoId: Long): Konto =
        kontoService.getKontoById(kontoId)

    @PostMapping("/konto")
    fun createKonto(@RequestBody payload: Konto): Konto = kontoService.createKonto(payload)

    @PutMapping("/konto/{id}")
    fun updateKontoById(@PathVariable("id") employeeId: Long, @RequestBody payload: Konto): Konto =
        kontoService.updateKontoById(employeeId, payload)
}