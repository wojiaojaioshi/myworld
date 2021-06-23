//package com.example.bigwork.Service;
//
//import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
//import com.example.bigwork.entities.login;
//import com.example.bigwork.mapper.UserMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.AuthorityUtils;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service("userDetailsService")
//public class MyUserDetailsService implements UserDetailsService {
//   @Autowired
//   private UserMapper userMapper;
//
//
//    @Override
//    public UserDetails loadUserByUsername(String loginid) throws UsernameNotFoundException {
//        QueryWrapper<login>wrapper=new QueryWrapper();
//        wrapper.eq("loginid", loginid);
//        login login= userMapper.selectOne(wrapper);
//       if(login==null)
//       {
//           throw new UsernameNotFoundException("用户名不存在");
//       }
//        System.out.println(login);
//
//
//
//        List<GrantedAuthority> authorities=
//                AuthorityUtils.commaSeparatedStringToAuthorityList("role");
//   return new User(login.getLoginid(),
//           new BCryptPasswordEncoder().encode(login.getPassword()), authorities);
//
//    }
//}
