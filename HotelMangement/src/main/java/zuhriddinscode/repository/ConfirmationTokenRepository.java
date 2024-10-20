package zuhriddinscode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zuhriddinscode.entity.ConfirmationToken;

@Repository("confirmationTokenRepository")
public interface ConfirmationTokenRepository extends JpaRepository<ConfirmationToken, String> {

    ConfirmationToken findByConfirmationToken(String confirmationToken);
}