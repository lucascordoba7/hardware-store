package com.lucas.hardwarestore.model.user;

import com.lucas.hardwarestore.model.order.OrderModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true, nullable = false)
    private String username;
    private String password;
    private String email;
    private String phone;
    @OneToMany(mappedBy = "user")
    private List<OrderModel> orders;
    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<RoleModel> roles;
}
