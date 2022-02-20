package no.uc.spring

import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service

@Service
class KontoService(private val kontoRepository: KontoRepository) {

    fun getAllKonto(): List<Konto> = kontoRepository.findAll()
    fun getKontoById(kontoId: Long): Konto = kontoRepository.findById(kontoId)
        .orElseThrow { KontoNotFoundException(HttpStatus.NOT_FOUND, "Konto ikke funnet") }

    fun createEmployee(konto: Konto): Konto = kontoRepository.save(konto)
}

class KontoNotFoundException(val statusCode: HttpStatus, val reason: String) : Exception()