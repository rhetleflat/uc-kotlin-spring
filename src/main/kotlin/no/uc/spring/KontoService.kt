package no.uc.spring

import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service

@Service
class KontoService(private val kontoRepository: KontoRepository) {

    fun getAllKonto(): List<Konto> = kontoRepository.findAll()
    fun getKontoById(kontoId: Long): Konto = kontoRepository.findById(kontoId)
        .orElseThrow { KontoNotFoundException(HttpStatus.NOT_FOUND, "Konto ikke funnet") }

    fun createKonto(konto: Konto): Konto = kontoRepository.save(konto)
    fun updateKontoById(kontoId: Long, konto: Konto): Konto {
        return if (kontoRepository.existsById(kontoId)) {
            kontoRepository.save(
                Konto(
                    id = konto.id,
                    kontonr = konto.kontonr,
                    navn = konto.navn,
                    adresse = konto.adresse,
                    postnr = konto.postnr,
                    rentesats = konto.rentesats,
                    saldo = konto.saldo
                )
            )
        } else throw KontoNotFoundException(HttpStatus.NOT_FOUND, "Konto ikke funnet")
    }
}

class KontoNotFoundException(val statusCode: HttpStatus, val reason: String) : Exception()