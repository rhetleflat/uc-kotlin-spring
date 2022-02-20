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
    fun createEmployee(@RequestBody payload: Konto): Konto = kontoService.createEmployee(payload)
}