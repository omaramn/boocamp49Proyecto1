/**
 * Este paquete contiene las clases relacionadas con las entidades de transacción.
 */
package com.example.demo.entitys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

/**
 * Clase que representa una entidad de transacción.
 */
@Document(collection = "transactions")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionEntity {
    /**
     * Identificador único de la transacción.
     */
    @Id
    private String id;

    /**
     * Identificador del cliente asociado a la transacción.
     */
    private String clientId;

    /**
     * Identificador de referencia de la transacción.
     */
    private String referenceId;

    /**
     * Monto de la transacción.
     */
    private Double amount;

    /**
     * Descripción de la transacción.
     */
    private String description;

    /**
     * Fecha y hora de la transacción.
     */
    private LocalDateTime transactionDate;

    /**
     * Tipo de transacción, que puede ser CREDIT_CARD, SAVINGS_ACCOUNT o LOAN.
     */
    private TransactionType transactionType;

    /**
     * Enumeración que define los posibles tipos de transacción.
     */
    public enum TransactionType {
        /**
         * Type de CREDIT_CARD.
         */
        CREDIT_CARD,
        /**
         * Type de SAVINGS_ACCOUNT.
         */
        SAVINGS_ACCOUNT,
        /**
         * Type de LOAN.
         */
        LOAN
    }
}
