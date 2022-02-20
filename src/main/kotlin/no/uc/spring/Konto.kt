package no.uc.spring

import javax.persistence.*

@Entity
@Table(name = "KONTO")
data class Konto(@Id
                 @GeneratedValue(strategy = GenerationType.AUTO)
                 val id: Long,
                 val kontonr: String,
                 val navn:String,
                 val adresse: String?,
                 val postnr:String?,
                 val rentesats:Int,
                 val saldo:Double
                 );