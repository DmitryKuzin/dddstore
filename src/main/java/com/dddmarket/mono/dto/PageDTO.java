package com.dddmarket.mono.dto;

import java.util.Objects;

public class PageDTO {
    private int page;
    private int size;

    public PageDTO() {}

    public PageDTO(int page, int size) {
        this.page = page;
        this.size = size;
    }

    public int getPage() {
        return page;
    }

    public int getSize() {
        return size;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PageDTO)) return false;
        PageDTO pageDTO = (PageDTO) o;
        return getPage() == pageDTO.getPage() &&
                getSize() == pageDTO.getSize();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPage(), getSize());
    }
}
