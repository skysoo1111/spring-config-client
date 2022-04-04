package com.study.springconfigclient.controller;

import com.study.springconfigclient.controller.restdocs.RestDocsController;
import com.study.springconfigclient.support.config.RestDocsMockMvcConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@Import(RestDocsMockMvcConfig.class)
@AutoConfigureRestDocs
@WebMvcTest(RestDocsController.class)
class RestDocsControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    @DisplayName("[GET] /docs")
    public void docsTest() throws Exception {
        // when
        ResultActions resultActions = mvc
            .perform(get("/docs"))
            .andDo(print());

        // then
        resultActions
            .andExpect(status().isOk())
            .andExpect(view().name("docs/api-doc"));
    }
}
