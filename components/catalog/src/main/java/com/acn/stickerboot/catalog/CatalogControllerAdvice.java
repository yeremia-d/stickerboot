package com.acn.stickerboot.catalog;

import com.acn.stickerboot.catalog.exceptions.CatalogItemNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class CatalogControllerAdvice {

    @ResponseBody
    @ExceptionHandler(CatalogItemNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String CatalogItemNotFoundAdvice(CatalogItemNotFoundException e) {
        return e.getMessage();
    }
}
