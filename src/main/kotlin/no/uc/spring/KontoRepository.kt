package no.uc.spring
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface KontoRepository : JpaRepository<Konto, Long>