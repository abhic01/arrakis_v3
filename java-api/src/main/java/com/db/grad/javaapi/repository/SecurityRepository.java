package com.db.grad.javaapi.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.db.grad.javaapi.model.Security;
import java.util.List;

@Repository
public interface SecurityRepository extends JpaRepository<Security, Long>
{
    // Find a bond based on ISIN number, which is unique to a bond
    @Query(nativeQuery = true, value = "select * from security where isin = :isin")
    List<Security> findSecurityByIsin(String isin);

    // Makes a list of all the bonds in the system
    @Query(nativeQuery = true, value = "select * from security")
    List<Security> findAllSecurity();

    // 
    @Query(nativeQuery = true, value = "select * from security where maturity_date between DATEADD('DAY', -5, CURRENT_DATE) and DATEADD('DAY', 5, CURRENT_DATE)")
    List<Security> getExpiringSecurities();
}
