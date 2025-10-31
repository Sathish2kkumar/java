package com.learning.orderservice.repository;

import com.learning.common.model.OrderStatus;
import com.learning.orderservice.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
    
    List<OrderEntity> findByUserId(Long userId);
    
    List<OrderEntity> findByStatus(OrderStatus status);
    
    List<OrderEntity> findByUserIdAndStatus(Long userId, OrderStatus status);
    
    List<OrderEntity> findByProductNameContainingIgnoreCase(String productName);
    
    @Query("SELECT o FROM OrderEntity o WHERE o.createdAt BETWEEN :startDate AND :endDate")
    List<OrderEntity> findOrdersCreatedBetween(@Param("startDate") LocalDateTime startDate, 
                                             @Param("endDate") LocalDateTime endDate);
    
    @Query("SELECT o FROM OrderEntity o WHERE o.totalAmount >= :minAmount AND o.totalAmount <= :maxAmount")
    List<OrderEntity> findOrdersByAmountRange(@Param("minAmount") BigDecimal minAmount, 
                                            @Param("maxAmount") BigDecimal maxAmount);
    
    @Query("SELECT COUNT(o) FROM OrderEntity o WHERE o.status = :status")
    Long countByStatus(@Param("status") OrderStatus status);
    
    @Query("SELECT SUM(o.totalAmount) FROM OrderEntity o WHERE o.status = :status")
    BigDecimal sumTotalAmountByStatus(@Param("status") OrderStatus status);
    
    @Query("SELECT o FROM OrderEntity o WHERE o.userId = :userId ORDER BY o.createdAt DESC")
    List<OrderEntity> findRecentOrdersByUserId(@Param("userId") Long userId);
    
    @Query("SELECT DISTINCT o.userId FROM OrderEntity o WHERE o.status = :status")
    List<Long> findDistinctUserIdsByStatus(@Param("status") OrderStatus status);
}