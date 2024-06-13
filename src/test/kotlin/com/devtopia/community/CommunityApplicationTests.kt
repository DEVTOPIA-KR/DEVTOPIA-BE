package com.devtopia.community

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles

@SpringBootTest()
@AutoConfigureMockMvc
@ActiveProfiles("local", "prod")
class CommunityApplicationTests() {}
