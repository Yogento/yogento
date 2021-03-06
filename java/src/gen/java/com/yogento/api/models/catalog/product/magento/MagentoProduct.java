package com.yogento.api.models.catalog.product.magento;

@SuppressWarnings({"serial"})
public class MagentoProduct implements org.thryft.TBase<MagentoProduct> {
    public static class Builder {
        public Builder() {
        }

        public Builder(final MagentoProduct other) {
            this.activationInformation = other.getActivationInformation();
            this.backorders = other.getBackorders();
            this.children = other.getChildren();
            this.cost = other.getCost();
            this.createdAt = other.getCreatedAt();
            this.description = other.getDescription();
            this.images = other.getImages();
            this.isInStock = other.getIsInStock();
            this.isQtyDecimal = other.getIsQtyDecimal();
            this.isRecurring = other.getIsRecurring();
            this.lowStockDate = other.getLowStockDate();
            this.maxSaleQty = other.getMaxSaleQty();
            this.metaDescription = other.getMetaDescription();
            this.metaKeyword = other.getMetaKeyword();
            this.metaTitle = other.getMetaTitle();
            this.minimalPrice = other.getMinimalPrice();
            this.minQty = other.getMinQty();
            this.minSaleQty = other.getMinSaleQty();
            this.model = other.getModel();
            this.name = other.getName();
            this.newsFromDate = other.getNewsFromDate();
            this.newsToDate = other.getNewsToDate();
            this.notifyStockQty = other.getNotifyStockQty();
            this.price = other.getPrice();
            this.qty = other.getQty();
            this.shippingPolicy = other.getShippingPolicy();
            this.shortDescription = other.getShortDescription();
            this.sku = other.getSku();
            this.specialFromDate = other.getSpecialFromDate();
            this.specialPrice = other.getSpecialPrice();
            this.specialToDate = other.getSpecialToDate();
            this.store = other.getStore();
            this.status = other.getStatus();
            this.tags = other.getTags();
            this.type = other.getType();
            this.updatedAt = other.getUpdatedAt();
            this.urlKey = other.getUrlKey();
            this.urlPath = other.getUrlPath();
            this.visibility = other.getVisibility();
            this.weight = other.getWeight();
        }

        protected MagentoProduct _build(final com.google.common.base.Optional<String> activationInformation, final com.google.common.base.Optional<Integer> backorders, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProduct>> children, final com.google.common.base.Optional<java.math.BigDecimal> cost, final com.google.common.base.Optional<org.joda.time.DateTime> createdAt, final com.google.common.base.Optional<String> description, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProductImage>> images, final com.google.common.base.Optional<Boolean> isInStock, final com.google.common.base.Optional<Boolean> isQtyDecimal, final com.google.common.base.Optional<Boolean> isRecurring, final com.google.common.base.Optional<org.joda.time.DateTime> lowStockDate, final com.google.common.base.Optional<java.math.BigDecimal> maxSaleQty, final com.google.common.base.Optional<String> metaDescription, final com.google.common.base.Optional<String> metaKeyword, final com.google.common.base.Optional<String> metaTitle, final com.google.common.base.Optional<java.math.BigDecimal> minimalPrice, final com.google.common.base.Optional<java.math.BigDecimal> minQty, final com.google.common.base.Optional<java.math.BigDecimal> minSaleQty, final com.google.common.base.Optional<String> model, final String name, final com.google.common.base.Optional<org.joda.time.DateTime> newsFromDate, final com.google.common.base.Optional<org.joda.time.DateTime> newsToDate, final com.google.common.base.Optional<java.math.BigDecimal> notifyStockQty, final com.google.common.base.Optional<java.math.BigDecimal> price, final com.google.common.base.Optional<java.math.BigDecimal> qty, final com.google.common.base.Optional<String> shippingPolicy, final String shortDescription, final String sku, final com.google.common.base.Optional<org.joda.time.DateTime> specialFromDate, final com.google.common.base.Optional<java.math.BigDecimal> specialPrice, final com.google.common.base.Optional<org.joda.time.DateTime> specialToDate, final String store, final com.google.common.base.Optional<com.yogento.api.models.catalog.product.magento.MagentoProductStatus> status, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> tags, final com.google.common.base.Optional<String> type, final com.google.common.base.Optional<org.joda.time.DateTime> updatedAt, final String urlKey, final com.google.common.base.Optional<String> urlPath, final com.google.common.collect.ImmutableSet<String> visibility, final com.google.common.base.Optional<java.math.BigDecimal> weight) {
            return new MagentoProduct(activationInformation, backorders, children, cost, createdAt, description, images, isInStock, isQtyDecimal, isRecurring, lowStockDate, maxSaleQty, metaDescription, metaKeyword, metaTitle, minimalPrice, minQty, minSaleQty, model, name, newsFromDate, newsToDate, notifyStockQty, price, qty, shippingPolicy, shortDescription, sku, specialFromDate, specialPrice, specialToDate, store, status, tags, type, updatedAt, urlKey, urlPath, visibility, weight);
        }

        public MagentoProduct build() {
            return _build(activationInformation, backorders, children, cost, createdAt, description, images, isInStock, isQtyDecimal, isRecurring, lowStockDate, maxSaleQty, metaDescription, metaKeyword, metaTitle, minimalPrice, minQty, minSaleQty, model, name, newsFromDate, newsToDate, notifyStockQty, price, qty, shippingPolicy, shortDescription, sku, specialFromDate, specialPrice, specialToDate, store, status, tags, type, updatedAt, urlKey, urlPath, visibility, weight);
        }

        public Builder setActivationInformation(final com.google.common.base.Optional<String> activationInformation) {
            this.activationInformation = activationInformation;
            return this;
        }

        public Builder setActivationInformation(final String activationInformation) {
            this.activationInformation = com.google.common.base.Optional.fromNullable(activationInformation);
            return this;
        }

        public Builder setBackorders(final com.google.common.base.Optional<Integer> backorders) {
            this.backorders = backorders;
            return this;
        }

        public Builder setBackorders(final int backorders) {
            this.backorders = com.google.common.base.Optional.fromNullable(backorders);
            return this;
        }

        public Builder setChildren(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProduct>> children) {
            this.children = children;
            return this;
        }

        public Builder setChildren(final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProduct> children) {
            this.children = com.google.common.base.Optional.fromNullable(children);
            return this;
        }

        public Builder setCost(final com.google.common.base.Optional<java.math.BigDecimal> cost) {
            this.cost = cost;
            return this;
        }

        public Builder setCost(final java.math.BigDecimal cost) {
            this.cost = com.google.common.base.Optional.fromNullable(cost);
            return this;
        }

        public Builder setCreatedAt(final com.google.common.base.Optional<org.joda.time.DateTime> createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setCreatedAt(final org.joda.time.DateTime createdAt) {
            this.createdAt = com.google.common.base.Optional.fromNullable(createdAt);
            return this;
        }

        public Builder setDescription(final com.google.common.base.Optional<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(final String description) {
            this.description = com.google.common.base.Optional.fromNullable(description);
            return this;
        }

        public Builder setImages(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProductImage>> images) {
            this.images = images;
            return this;
        }

        public Builder setImages(final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProductImage> images) {
            this.images = com.google.common.base.Optional.fromNullable(images);
            return this;
        }

        public Builder setIsInStock(final com.google.common.base.Optional<Boolean> isInStock) {
            this.isInStock = isInStock;
            return this;
        }

        public Builder setIsInStock(final boolean isInStock) {
            this.isInStock = com.google.common.base.Optional.fromNullable(isInStock);
            return this;
        }

        public Builder setIsQtyDecimal(final com.google.common.base.Optional<Boolean> isQtyDecimal) {
            this.isQtyDecimal = isQtyDecimal;
            return this;
        }

        public Builder setIsQtyDecimal(final boolean isQtyDecimal) {
            this.isQtyDecimal = com.google.common.base.Optional.fromNullable(isQtyDecimal);
            return this;
        }

        public Builder setIsRecurring(final com.google.common.base.Optional<Boolean> isRecurring) {
            this.isRecurring = isRecurring;
            return this;
        }

        public Builder setIsRecurring(final boolean isRecurring) {
            this.isRecurring = com.google.common.base.Optional.fromNullable(isRecurring);
            return this;
        }

        public Builder setLowStockDate(final com.google.common.base.Optional<org.joda.time.DateTime> lowStockDate) {
            this.lowStockDate = lowStockDate;
            return this;
        }

        public Builder setLowStockDate(final org.joda.time.DateTime lowStockDate) {
            this.lowStockDate = com.google.common.base.Optional.fromNullable(lowStockDate);
            return this;
        }

        public Builder setMaxSaleQty(final com.google.common.base.Optional<java.math.BigDecimal> maxSaleQty) {
            this.maxSaleQty = maxSaleQty;
            return this;
        }

        public Builder setMaxSaleQty(final java.math.BigDecimal maxSaleQty) {
            this.maxSaleQty = com.google.common.base.Optional.fromNullable(maxSaleQty);
            return this;
        }

        public Builder setMetaDescription(final com.google.common.base.Optional<String> metaDescription) {
            this.metaDescription = metaDescription;
            return this;
        }

        public Builder setMetaDescription(final String metaDescription) {
            this.metaDescription = com.google.common.base.Optional.fromNullable(metaDescription);
            return this;
        }

        public Builder setMetaKeyword(final com.google.common.base.Optional<String> metaKeyword) {
            this.metaKeyword = metaKeyword;
            return this;
        }

        public Builder setMetaKeyword(final String metaKeyword) {
            this.metaKeyword = com.google.common.base.Optional.fromNullable(metaKeyword);
            return this;
        }

        public Builder setMetaTitle(final com.google.common.base.Optional<String> metaTitle) {
            this.metaTitle = metaTitle;
            return this;
        }

        public Builder setMetaTitle(final String metaTitle) {
            this.metaTitle = com.google.common.base.Optional.fromNullable(metaTitle);
            return this;
        }

        public Builder setMinQty(final com.google.common.base.Optional<java.math.BigDecimal> minQty) {
            this.minQty = minQty;
            return this;
        }

        public Builder setMinQty(final java.math.BigDecimal minQty) {
            this.minQty = com.google.common.base.Optional.fromNullable(minQty);
            return this;
        }

        public Builder setMinSaleQty(final com.google.common.base.Optional<java.math.BigDecimal> minSaleQty) {
            this.minSaleQty = minSaleQty;
            return this;
        }

        public Builder setMinSaleQty(final java.math.BigDecimal minSaleQty) {
            this.minSaleQty = com.google.common.base.Optional.fromNullable(minSaleQty);
            return this;
        }

        public Builder setMinimalPrice(final com.google.common.base.Optional<java.math.BigDecimal> minimalPrice) {
            this.minimalPrice = minimalPrice;
            return this;
        }

        public Builder setMinimalPrice(final java.math.BigDecimal minimalPrice) {
            this.minimalPrice = com.google.common.base.Optional.fromNullable(minimalPrice);
            return this;
        }

        public Builder setModel(final com.google.common.base.Optional<String> model) {
            this.model = model;
            return this;
        }

        public Builder setModel(final String model) {
            this.model = com.google.common.base.Optional.fromNullable(model);
            return this;
        }

        public Builder setName(final String name) {
            this.name = name;
            return this;
        }

        public Builder setNewsFromDate(final com.google.common.base.Optional<org.joda.time.DateTime> newsFromDate) {
            this.newsFromDate = newsFromDate;
            return this;
        }

        public Builder setNewsFromDate(final org.joda.time.DateTime newsFromDate) {
            this.newsFromDate = com.google.common.base.Optional.fromNullable(newsFromDate);
            return this;
        }

        public Builder setNewsToDate(final com.google.common.base.Optional<org.joda.time.DateTime> newsToDate) {
            this.newsToDate = newsToDate;
            return this;
        }

        public Builder setNewsToDate(final org.joda.time.DateTime newsToDate) {
            this.newsToDate = com.google.common.base.Optional.fromNullable(newsToDate);
            return this;
        }

        public Builder setNotifyStockQty(final com.google.common.base.Optional<java.math.BigDecimal> notifyStockQty) {
            this.notifyStockQty = notifyStockQty;
            return this;
        }

        public Builder setNotifyStockQty(final java.math.BigDecimal notifyStockQty) {
            this.notifyStockQty = com.google.common.base.Optional.fromNullable(notifyStockQty);
            return this;
        }

        public Builder setPrice(final com.google.common.base.Optional<java.math.BigDecimal> price) {
            this.price = price;
            return this;
        }

        public Builder setPrice(final java.math.BigDecimal price) {
            this.price = com.google.common.base.Optional.fromNullable(price);
            return this;
        }

        public Builder setQty(final com.google.common.base.Optional<java.math.BigDecimal> qty) {
            this.qty = qty;
            return this;
        }

        public Builder setQty(final java.math.BigDecimal qty) {
            this.qty = com.google.common.base.Optional.fromNullable(qty);
            return this;
        }

        public Builder setShippingPolicy(final com.google.common.base.Optional<String> shippingPolicy) {
            this.shippingPolicy = shippingPolicy;
            return this;
        }

        public Builder setShippingPolicy(final String shippingPolicy) {
            this.shippingPolicy = com.google.common.base.Optional.fromNullable(shippingPolicy);
            return this;
        }

        public Builder setShortDescription(final String shortDescription) {
            this.shortDescription = shortDescription;
            return this;
        }

        public Builder setSku(final String sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSpecialFromDate(final com.google.common.base.Optional<org.joda.time.DateTime> specialFromDate) {
            this.specialFromDate = specialFromDate;
            return this;
        }

        public Builder setSpecialFromDate(final org.joda.time.DateTime specialFromDate) {
            this.specialFromDate = com.google.common.base.Optional.fromNullable(specialFromDate);
            return this;
        }

        public Builder setSpecialPrice(final com.google.common.base.Optional<java.math.BigDecimal> specialPrice) {
            this.specialPrice = specialPrice;
            return this;
        }

        public Builder setSpecialPrice(final java.math.BigDecimal specialPrice) {
            this.specialPrice = com.google.common.base.Optional.fromNullable(specialPrice);
            return this;
        }

        public Builder setSpecialToDate(final com.google.common.base.Optional<org.joda.time.DateTime> specialToDate) {
            this.specialToDate = specialToDate;
            return this;
        }

        public Builder setSpecialToDate(final org.joda.time.DateTime specialToDate) {
            this.specialToDate = com.google.common.base.Optional.fromNullable(specialToDate);
            return this;
        }

        public Builder setStatus(final com.google.common.base.Optional<com.yogento.api.models.catalog.product.magento.MagentoProductStatus> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(final com.yogento.api.models.catalog.product.magento.MagentoProductStatus status) {
            this.status = com.google.common.base.Optional.fromNullable(status);
            return this;
        }

        public Builder setStore(final String store) {
            this.store = store;
            return this;
        }

        public Builder setTags(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(final com.google.common.collect.ImmutableSet<String> tags) {
            this.tags = com.google.common.base.Optional.fromNullable(tags);
            return this;
        }

        public Builder setType(final com.google.common.base.Optional<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(final String type) {
            this.type = com.google.common.base.Optional.fromNullable(type);
            return this;
        }

        public Builder setUpdatedAt(final com.google.common.base.Optional<org.joda.time.DateTime> updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder setUpdatedAt(final org.joda.time.DateTime updatedAt) {
            this.updatedAt = com.google.common.base.Optional.fromNullable(updatedAt);
            return this;
        }

        public Builder setUrlKey(final String urlKey) {
            this.urlKey = urlKey;
            return this;
        }

        public Builder setUrlPath(final com.google.common.base.Optional<String> urlPath) {
            this.urlPath = urlPath;
            return this;
        }

        public Builder setUrlPath(final String urlPath) {
            this.urlPath = com.google.common.base.Optional.fromNullable(urlPath);
            return this;
        }

        public Builder setVisibility(final com.google.common.collect.ImmutableSet<String> visibility) {
            this.visibility = visibility;
            return this;
        }

        public Builder setWeight(final com.google.common.base.Optional<java.math.BigDecimal> weight) {
            this.weight = weight;
            return this;
        }

        public Builder setWeight(final java.math.BigDecimal weight) {
            this.weight = com.google.common.base.Optional.fromNullable(weight);
            return this;
        }

        private com.google.common.base.Optional<String> activationInformation = com.google.common.base.Optional.absent();
        private com.google.common.base.Optional<Integer> backorders = com.google.common.base.Optional.absent();
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProduct>> children = com.google.common.base.Optional.absent();
        private com.google.common.base.Optional<java.math.BigDecimal> cost = com.google.common.base.Optional.absent();
        private com.google.common.base.Optional<org.joda.time.DateTime> createdAt = com.google.common.base.Optional.absent();
        private com.google.common.base.Optional<String> description = com.google.common.base.Optional.absent();
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProductImage>> images = com.google.common.base.Optional.absent();
        private com.google.common.base.Optional<Boolean> isInStock = com.google.common.base.Optional.absent();
        private com.google.common.base.Optional<Boolean> isQtyDecimal = com.google.common.base.Optional.absent();
        private com.google.common.base.Optional<Boolean> isRecurring = com.google.common.base.Optional.absent();
        private com.google.common.base.Optional<org.joda.time.DateTime> lowStockDate = com.google.common.base.Optional.absent();
        private com.google.common.base.Optional<java.math.BigDecimal> maxSaleQty = com.google.common.base.Optional.absent();
        private com.google.common.base.Optional<String> metaDescription = com.google.common.base.Optional.absent();
        private com.google.common.base.Optional<String> metaKeyword = com.google.common.base.Optional.absent();
        private com.google.common.base.Optional<String> metaTitle = com.google.common.base.Optional.absent();
        private com.google.common.base.Optional<java.math.BigDecimal> minimalPrice = com.google.common.base.Optional.absent();
        private com.google.common.base.Optional<java.math.BigDecimal> minQty = com.google.common.base.Optional.absent();
        private com.google.common.base.Optional<java.math.BigDecimal> minSaleQty = com.google.common.base.Optional.absent();
        private com.google.common.base.Optional<String> model = com.google.common.base.Optional.absent();
        private String name;
        private com.google.common.base.Optional<org.joda.time.DateTime> newsFromDate = com.google.common.base.Optional.absent();
        private com.google.common.base.Optional<org.joda.time.DateTime> newsToDate = com.google.common.base.Optional.absent();
        private com.google.common.base.Optional<java.math.BigDecimal> notifyStockQty = com.google.common.base.Optional.absent();
        /**
         * Optional in 1.3
         */
        private com.google.common.base.Optional<java.math.BigDecimal> price = com.google.common.base.Optional.absent();
        private com.google.common.base.Optional<java.math.BigDecimal> qty = com.google.common.base.Optional.absent();
        private com.google.common.base.Optional<String> shippingPolicy = com.google.common.base.Optional.absent();
        private String shortDescription;
        private String sku;
        private com.google.common.base.Optional<org.joda.time.DateTime> specialFromDate = com.google.common.base.Optional.absent();
        private com.google.common.base.Optional<java.math.BigDecimal> specialPrice = com.google.common.base.Optional.absent();
        private com.google.common.base.Optional<org.joda.time.DateTime> specialToDate = com.google.common.base.Optional.absent();
        private String store;
        /**
         * Optional in 1.3
         */
        private com.google.common.base.Optional<com.yogento.api.models.catalog.product.magento.MagentoProductStatus> status = com.google.common.base.Optional.absent();
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> tags = com.google.common.base.Optional.absent();
        /**
         * Optional in 1.3
         */
        private com.google.common.base.Optional<String> type = com.google.common.base.Optional.absent();
        private com.google.common.base.Optional<org.joda.time.DateTime> updatedAt = com.google.common.base.Optional.absent();
        private String urlKey;
        /**
         * Optional in 1.3
         */
        private com.google.common.base.Optional<String> urlPath = com.google.common.base.Optional.absent();
        /**
         * Formerly an enum; the strings differ between Magento versions
         */
        private com.google.common.collect.ImmutableSet<String> visibility;
        private com.google.common.base.Optional<java.math.BigDecimal> weight = com.google.common.base.Optional.absent();
    }

    public MagentoProduct(final MagentoProduct other) {
        this(other.getActivationInformation(), other.getBackorders(), other.getChildren(), other.getCost(), other.getCreatedAt(), other.getDescription(), other.getImages(), other.getIsInStock(), other.getIsQtyDecimal(), other.getIsRecurring(), other.getLowStockDate(), other.getMaxSaleQty(), other.getMetaDescription(), other.getMetaKeyword(), other.getMetaTitle(), other.getMinimalPrice(), other.getMinQty(), other.getMinSaleQty(), other.getModel(), other.getName(), other.getNewsFromDate(), other.getNewsToDate(), other.getNotifyStockQty(), other.getPrice(), other.getQty(), other.getShippingPolicy(), other.getShortDescription(), other.getSku(), other.getSpecialFromDate(), other.getSpecialPrice(), other.getSpecialToDate(), other.getStore(), other.getStatus(), other.getTags(), other.getType(), other.getUpdatedAt(), other.getUrlKey(), other.getUrlPath(), other.getVisibility(), other.getWeight());
    }

    public MagentoProduct(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
        this(iprot, org.thryft.protocol.TType.STRUCT);
    }

    public MagentoProduct(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
        com.google.common.base.Optional<String> activationInformation = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<Integer> backorders = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProduct>> children = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<java.math.BigDecimal> cost = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<org.joda.time.DateTime> createdAt = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> description = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProductImage>> images = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<Boolean> isInStock = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<Boolean> isQtyDecimal = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<Boolean> isRecurring = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<org.joda.time.DateTime> lowStockDate = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<java.math.BigDecimal> maxSaleQty = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> metaDescription = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> metaKeyword = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> metaTitle = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<java.math.BigDecimal> minimalPrice = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<java.math.BigDecimal> minQty = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<java.math.BigDecimal> minSaleQty = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> model = com.google.common.base.Optional.absent();
        String name = null;
        com.google.common.base.Optional<org.joda.time.DateTime> newsFromDate = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<org.joda.time.DateTime> newsToDate = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<java.math.BigDecimal> notifyStockQty = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<java.math.BigDecimal> price = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<java.math.BigDecimal> qty = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> shippingPolicy = com.google.common.base.Optional.absent();
        String shortDescription = null;
        String sku = null;
        com.google.common.base.Optional<org.joda.time.DateTime> specialFromDate = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<java.math.BigDecimal> specialPrice = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<org.joda.time.DateTime> specialToDate = com.google.common.base.Optional.absent();
        String store = null;
        com.google.common.base.Optional<com.yogento.api.models.catalog.product.magento.MagentoProductStatus> status = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> tags = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> type = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<org.joda.time.DateTime> updatedAt = com.google.common.base.Optional.absent();
        String urlKey = null;
        com.google.common.base.Optional<String> urlPath = com.google.common.base.Optional.absent();
        com.google.common.collect.ImmutableSet<String> visibility = null;
        com.google.common.base.Optional<java.math.BigDecimal> weight = com.google.common.base.Optional.absent();

        switch (readAsTType) {
            case org.thryft.protocol.TType.LIST:
                final org.thryft.protocol.TList __list = iprot.readListBegin();
                activationInformation = com.google.common.base.Optional.of(iprot.readString());
                try {
                    backorders = com.google.common.base.Optional.of(iprot.readI32());
                } catch (NumberFormatException e) {
                }
                children = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.TProtocol, com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProduct>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProduct> apply(final org.thryft.protocol.TProtocol iprot) {
                        try {
                            final org.thryft.protocol.TSet sequenceBegin = iprot.readSetBegin();
                            final com.google.common.collect.ImmutableSet.Builder<com.yogento.api.models.catalog.product.magento.MagentoProduct> sequence = com.google.common.collect.ImmutableSet.builder();
                            for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                sequence.add(new com.yogento.api.models.catalog.product.magento.MagentoProduct(iprot));
                            }
                            iprot.readSetEnd();
                            return sequence.build();
                        } catch (final java.io.IOException e) {
                            return com.google.common.collect.ImmutableSet.of();
                        }
                    }
                }).apply(iprot));
                try {
                    cost = com.google.common.base.Optional.of(iprot.readDecimal());
                } catch (NumberFormatException e) {
                }
                try {
                    createdAt = com.google.common.base.Optional.of(iprot.readDateTime());
                } catch (IllegalArgumentException e) {
                }
                description = com.google.common.base.Optional.of(iprot.readString());
                images = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.TProtocol, com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProductImage>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProductImage> apply(final org.thryft.protocol.TProtocol iprot) {
                        try {
                            final org.thryft.protocol.TSet sequenceBegin = iprot.readSetBegin();
                            final com.google.common.collect.ImmutableSet.Builder<com.yogento.api.models.catalog.product.magento.MagentoProductImage> sequence = com.google.common.collect.ImmutableSet.builder();
                            for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                sequence.add(new com.yogento.api.models.catalog.product.magento.MagentoProductImage(iprot));
                            }
                            iprot.readSetEnd();
                            return sequence.build();
                        } catch (final java.io.IOException e) {
                            return com.google.common.collect.ImmutableSet.of();
                        }
                    }
                }).apply(iprot));
                isInStock = com.google.common.base.Optional.of(iprot.readBool());
                isQtyDecimal = com.google.common.base.Optional.of(iprot.readBool());
                isRecurring = com.google.common.base.Optional.of(iprot.readBool());
                try {
                    lowStockDate = com.google.common.base.Optional.of(iprot.readDateTime());
                } catch (IllegalArgumentException e) {
                }
                try {
                    maxSaleQty = com.google.common.base.Optional.of(iprot.readDecimal());
                } catch (NumberFormatException e) {
                }
                metaDescription = com.google.common.base.Optional.of(iprot.readString());
                metaKeyword = com.google.common.base.Optional.of(iprot.readString());
                metaTitle = com.google.common.base.Optional.of(iprot.readString());
                try {
                    minimalPrice = com.google.common.base.Optional.of(iprot.readDecimal());
                } catch (NumberFormatException e) {
                }
                try {
                    minQty = com.google.common.base.Optional.of(iprot.readDecimal());
                } catch (NumberFormatException e) {
                }
                try {
                    minSaleQty = com.google.common.base.Optional.of(iprot.readDecimal());
                } catch (NumberFormatException e) {
                }
                model = com.google.common.base.Optional.of(iprot.readString());
                name = iprot.readString();
                try {
                    newsFromDate = com.google.common.base.Optional.of(iprot.readDateTime());
                } catch (IllegalArgumentException e) {
                }
                try {
                    newsToDate = com.google.common.base.Optional.of(iprot.readDateTime());
                } catch (IllegalArgumentException e) {
                }
                try {
                    notifyStockQty = com.google.common.base.Optional.of(iprot.readDecimal());
                } catch (NumberFormatException e) {
                }
                try {
                    price = com.google.common.base.Optional.of(iprot.readDecimal());
                } catch (NumberFormatException e) {
                }
                try {
                    qty = com.google.common.base.Optional.of(iprot.readDecimal());
                } catch (NumberFormatException e) {
                }
                shippingPolicy = com.google.common.base.Optional.of(iprot.readString());
                shortDescription = iprot.readString();
                sku = iprot.readString();
                try {
                    specialFromDate = com.google.common.base.Optional.of(iprot.readDateTime());
                } catch (IllegalArgumentException e) {
                }
                try {
                    specialPrice = com.google.common.base.Optional.of(iprot.readDecimal());
                } catch (NumberFormatException e) {
                }
                try {
                    specialToDate = com.google.common.base.Optional.of(iprot.readDateTime());
                } catch (IllegalArgumentException e) {
                }
                store = iprot.readString();
                try {
                    status = com.google.common.base.Optional.of(iprot.readEnum(com.yogento.api.models.catalog.product.magento.MagentoProductStatus.class));
                } catch (IllegalArgumentException e) {
                }
                tags = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.TProtocol, com.google.common.collect.ImmutableSet<String>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.TProtocol iprot) {
                        try {
                            final org.thryft.protocol.TSet sequenceBegin = iprot.readSetBegin();
                            final com.google.common.collect.ImmutableSet.Builder<String> sequence = com.google.common.collect.ImmutableSet.builder();
                            for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                sequence.add(iprot.readString());
                            }
                            iprot.readSetEnd();
                            return sequence.build();
                        } catch (final java.io.IOException e) {
                            return com.google.common.collect.ImmutableSet.of();
                        }
                    }
                }).apply(iprot));
                type = com.google.common.base.Optional.of(iprot.readString());
                try {
                    updatedAt = com.google.common.base.Optional.of(iprot.readDateTime());
                } catch (IllegalArgumentException e) {
                }
                urlKey = iprot.readString();
                urlPath = com.google.common.base.Optional.of(iprot.readString());
                visibility = (new com.google.common.base.Function<org.thryft.protocol.TProtocol, com.google.common.collect.ImmutableSet<String>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.TProtocol iprot) {
                        try {
                            final org.thryft.protocol.TSet sequenceBegin = iprot.readSetBegin();
                            final com.google.common.collect.ImmutableSet.Builder<String> sequence = com.google.common.collect.ImmutableSet.builder();
                            for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                sequence.add(iprot.readString());
                            }
                            iprot.readSetEnd();
                            return sequence.build();
                        } catch (final java.io.IOException e) {
                            return com.google.common.collect.ImmutableSet.of();
                        }
                    }
                }).apply(iprot);
                if (__list.size > 39) {
                    try {
                        weight = com.google.common.base.Optional.of(iprot.readDecimal());
                    } catch (NumberFormatException e) {
                    }
                }
                iprot.readListEnd();
                break;

            case org.thryft.protocol.TType.STRUCT:
            default:
                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.TField ifield = iprot.readFieldBegin();
                    if (ifield.type == org.thryft.protocol.TType.STOP) {
                        break;
                    } else if (ifield.name.equals("activation_information")) {
                        activationInformation = com.google.common.base.Optional.of(iprot.readString());
                    } else if (ifield.name.equals("backorders")) {
                        try {
                            backorders = com.google.common.base.Optional.of(iprot.readI32());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("children")) {
                        children = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.TProtocol, com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProduct>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProduct> apply(final org.thryft.protocol.TProtocol iprot) {
                                try {
                                    final org.thryft.protocol.TSet sequenceBegin = iprot.readSetBegin();
                                    final com.google.common.collect.ImmutableSet.Builder<com.yogento.api.models.catalog.product.magento.MagentoProduct> sequence = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                        sequence.add(new com.yogento.api.models.catalog.product.magento.MagentoProduct(iprot));
                                    }
                                    iprot.readSetEnd();
                                    return sequence.build();
                                } catch (final java.io.IOException e) {
                                    return com.google.common.collect.ImmutableSet.of();
                                }
                            }
                        }).apply(iprot));
                    } else if (ifield.name.equals("cost")) {
                        try {
                            cost = com.google.common.base.Optional.of(iprot.readDecimal());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("created_at")) {
                        try {
                            createdAt = com.google.common.base.Optional.of(iprot.readDateTime());
                        } catch (IllegalArgumentException e) {
                        }
                    } else if (ifield.name.equals("description")) {
                        description = com.google.common.base.Optional.of(iprot.readString());
                    } else if (ifield.name.equals("images")) {
                        images = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.TProtocol, com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProductImage>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProductImage> apply(final org.thryft.protocol.TProtocol iprot) {
                                try {
                                    final org.thryft.protocol.TSet sequenceBegin = iprot.readSetBegin();
                                    final com.google.common.collect.ImmutableSet.Builder<com.yogento.api.models.catalog.product.magento.MagentoProductImage> sequence = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                        sequence.add(new com.yogento.api.models.catalog.product.magento.MagentoProductImage(iprot));
                                    }
                                    iprot.readSetEnd();
                                    return sequence.build();
                                } catch (final java.io.IOException e) {
                                    return com.google.common.collect.ImmutableSet.of();
                                }
                            }
                        }).apply(iprot));
                    } else if (ifield.name.equals("is_in_stock")) {
                        isInStock = com.google.common.base.Optional.of(iprot.readBool());
                    } else if (ifield.name.equals("is_qty_decimal")) {
                        isQtyDecimal = com.google.common.base.Optional.of(iprot.readBool());
                    } else if (ifield.name.equals("is_recurring")) {
                        isRecurring = com.google.common.base.Optional.of(iprot.readBool());
                    } else if (ifield.name.equals("low_stock_date")) {
                        try {
                            lowStockDate = com.google.common.base.Optional.of(iprot.readDateTime());
                        } catch (IllegalArgumentException e) {
                        }
                    } else if (ifield.name.equals("max_sale_qty")) {
                        try {
                            maxSaleQty = com.google.common.base.Optional.of(iprot.readDecimal());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("meta_description")) {
                        metaDescription = com.google.common.base.Optional.of(iprot.readString());
                    } else if (ifield.name.equals("meta_keyword")) {
                        metaKeyword = com.google.common.base.Optional.of(iprot.readString());
                    } else if (ifield.name.equals("meta_title")) {
                        metaTitle = com.google.common.base.Optional.of(iprot.readString());
                    } else if (ifield.name.equals("minimal_price")) {
                        try {
                            minimalPrice = com.google.common.base.Optional.of(iprot.readDecimal());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("min_qty")) {
                        try {
                            minQty = com.google.common.base.Optional.of(iprot.readDecimal());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("min_sale_qty")) {
                        try {
                            minSaleQty = com.google.common.base.Optional.of(iprot.readDecimal());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("model")) {
                        model = com.google.common.base.Optional.of(iprot.readString());
                    } else if (ifield.name.equals("name")) {
                        name = iprot.readString();
                    } else if (ifield.name.equals("news_from_date")) {
                        try {
                            newsFromDate = com.google.common.base.Optional.of(iprot.readDateTime());
                        } catch (IllegalArgumentException e) {
                        }
                    } else if (ifield.name.equals("news_to_date")) {
                        try {
                            newsToDate = com.google.common.base.Optional.of(iprot.readDateTime());
                        } catch (IllegalArgumentException e) {
                        }
                    } else if (ifield.name.equals("notify_stock_qty")) {
                        try {
                            notifyStockQty = com.google.common.base.Optional.of(iprot.readDecimal());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("price")) {
                        try {
                            price = com.google.common.base.Optional.of(iprot.readDecimal());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("qty")) {
                        try {
                            qty = com.google.common.base.Optional.of(iprot.readDecimal());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("shipping_policy")) {
                        shippingPolicy = com.google.common.base.Optional.of(iprot.readString());
                    } else if (ifield.name.equals("short_description")) {
                        shortDescription = iprot.readString();
                    } else if (ifield.name.equals("sku")) {
                        sku = iprot.readString();
                    } else if (ifield.name.equals("special_from_date")) {
                        try {
                            specialFromDate = com.google.common.base.Optional.of(iprot.readDateTime());
                        } catch (IllegalArgumentException e) {
                        }
                    } else if (ifield.name.equals("special_price")) {
                        try {
                            specialPrice = com.google.common.base.Optional.of(iprot.readDecimal());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("special_to_date")) {
                        try {
                            specialToDate = com.google.common.base.Optional.of(iprot.readDateTime());
                        } catch (IllegalArgumentException e) {
                        }
                    } else if (ifield.name.equals("store")) {
                        store = iprot.readString();
                    } else if (ifield.name.equals("status")) {
                        try {
                            status = com.google.common.base.Optional.of(iprot.readEnum(com.yogento.api.models.catalog.product.magento.MagentoProductStatus.class));
                        } catch (IllegalArgumentException e) {
                        }
                    } else if (ifield.name.equals("tags")) {
                        tags = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.TProtocol, com.google.common.collect.ImmutableSet<String>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.TProtocol iprot) {
                                try {
                                    final org.thryft.protocol.TSet sequenceBegin = iprot.readSetBegin();
                                    final com.google.common.collect.ImmutableSet.Builder<String> sequence = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                        sequence.add(iprot.readString());
                                    }
                                    iprot.readSetEnd();
                                    return sequence.build();
                                } catch (final java.io.IOException e) {
                                    return com.google.common.collect.ImmutableSet.of();
                                }
                            }
                        }).apply(iprot));
                    } else if (ifield.name.equals("type")) {
                        type = com.google.common.base.Optional.of(iprot.readString());
                    } else if (ifield.name.equals("updated_at")) {
                        try {
                            updatedAt = com.google.common.base.Optional.of(iprot.readDateTime());
                        } catch (IllegalArgumentException e) {
                        }
                    } else if (ifield.name.equals("url_key")) {
                        urlKey = iprot.readString();
                    } else if (ifield.name.equals("url_path")) {
                        urlPath = com.google.common.base.Optional.of(iprot.readString());
                    } else if (ifield.name.equals("visibility")) {
                        visibility = (new com.google.common.base.Function<org.thryft.protocol.TProtocol, com.google.common.collect.ImmutableSet<String>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.TProtocol iprot) {
                                try {
                                    final org.thryft.protocol.TSet sequenceBegin = iprot.readSetBegin();
                                    final com.google.common.collect.ImmutableSet.Builder<String> sequence = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                        sequence.add(iprot.readString());
                                    }
                                    iprot.readSetEnd();
                                    return sequence.build();
                                } catch (final java.io.IOException e) {
                                    return com.google.common.collect.ImmutableSet.of();
                                }
                            }
                        }).apply(iprot);
                    } else if (ifield.name.equals("weight")) {
                        try {
                            weight = com.google.common.base.Optional.of(iprot.readDecimal());
                        } catch (NumberFormatException e) {
                        }
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                break;
        }

        this.activationInformation = activationInformation;
        this.backorders = backorders;
        this.children = children;
        this.cost = cost;
        this.createdAt = createdAt;
        this.description = description;
        this.images = images;
        this.isInStock = isInStock;
        this.isQtyDecimal = isQtyDecimal;
        this.isRecurring = isRecurring;
        this.lowStockDate = lowStockDate;
        this.maxSaleQty = maxSaleQty;
        this.metaDescription = metaDescription;
        this.metaKeyword = metaKeyword;
        this.metaTitle = metaTitle;
        this.minimalPrice = minimalPrice;
        this.minQty = minQty;
        this.minSaleQty = minSaleQty;
        this.model = model;
        this.name = com.google.common.base.Preconditions.checkNotNull(name, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing name");
        this.newsFromDate = newsFromDate;
        this.newsToDate = newsToDate;
        this.notifyStockQty = notifyStockQty;
        this.price = price;
        this.qty = qty;
        this.shippingPolicy = shippingPolicy;
        this.shortDescription = com.google.common.base.Preconditions.checkNotNull(shortDescription, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing shortDescription");
        this.sku = com.google.common.base.Preconditions.checkNotNull(sku, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing sku");
        this.specialFromDate = specialFromDate;
        this.specialPrice = specialPrice;
        this.specialToDate = specialToDate;
        this.store = com.google.common.base.Preconditions.checkNotNull(store, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing store");
        this.status = status;
        this.tags = tags;
        this.type = type;
        this.updatedAt = updatedAt;
        this.urlKey = com.google.common.base.Preconditions.checkNotNull(urlKey, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing urlKey");
        this.urlPath = urlPath;
        this.visibility = com.google.common.base.Preconditions.checkNotNull(visibility, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing visibility");
        this.weight = weight;
    }

    public MagentoProduct(final String name, final String shortDescription, final String sku, final String store, final String urlKey, final com.google.common.collect.ImmutableSet<String> visibility) {
        this.activationInformation = com.google.common.base.Optional.absent();
        this.backorders = com.google.common.base.Optional.absent();
        this.children = com.google.common.base.Optional.absent();
        this.cost = com.google.common.base.Optional.absent();
        this.createdAt = com.google.common.base.Optional.absent();
        this.description = com.google.common.base.Optional.absent();
        this.images = com.google.common.base.Optional.absent();
        this.isInStock = com.google.common.base.Optional.absent();
        this.isQtyDecimal = com.google.common.base.Optional.absent();
        this.isRecurring = com.google.common.base.Optional.absent();
        this.lowStockDate = com.google.common.base.Optional.absent();
        this.maxSaleQty = com.google.common.base.Optional.absent();
        this.metaDescription = com.google.common.base.Optional.absent();
        this.metaKeyword = com.google.common.base.Optional.absent();
        this.metaTitle = com.google.common.base.Optional.absent();
        this.minimalPrice = com.google.common.base.Optional.absent();
        this.minQty = com.google.common.base.Optional.absent();
        this.minSaleQty = com.google.common.base.Optional.absent();
        this.model = com.google.common.base.Optional.absent();
        this.name = com.google.common.base.Preconditions.checkNotNull(name, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing name");
        this.newsFromDate = com.google.common.base.Optional.absent();
        this.newsToDate = com.google.common.base.Optional.absent();
        this.notifyStockQty = com.google.common.base.Optional.absent();
        this.price = com.google.common.base.Optional.absent();
        this.qty = com.google.common.base.Optional.absent();
        this.shippingPolicy = com.google.common.base.Optional.absent();
        this.shortDescription = com.google.common.base.Preconditions.checkNotNull(shortDescription, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing shortDescription");
        this.sku = com.google.common.base.Preconditions.checkNotNull(sku, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing sku");
        this.specialFromDate = com.google.common.base.Optional.absent();
        this.specialPrice = com.google.common.base.Optional.absent();
        this.specialToDate = com.google.common.base.Optional.absent();
        this.store = com.google.common.base.Preconditions.checkNotNull(store, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing store");
        this.status = com.google.common.base.Optional.absent();
        this.tags = com.google.common.base.Optional.absent();
        this.type = com.google.common.base.Optional.absent();
        this.updatedAt = com.google.common.base.Optional.absent();
        this.urlKey = com.google.common.base.Preconditions.checkNotNull(urlKey, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing urlKey");
        this.urlPath = com.google.common.base.Optional.absent();
        this.visibility = com.google.common.base.Preconditions.checkNotNull(visibility, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing visibility");
        this.weight = com.google.common.base.Optional.absent();
    }

    public MagentoProduct(final com.google.common.base.Optional<String> activationInformation, final com.google.common.base.Optional<Integer> backorders, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProduct>> children, final com.google.common.base.Optional<java.math.BigDecimal> cost, final com.google.common.base.Optional<org.joda.time.DateTime> createdAt, final com.google.common.base.Optional<String> description, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProductImage>> images, final com.google.common.base.Optional<Boolean> isInStock, final com.google.common.base.Optional<Boolean> isQtyDecimal, final com.google.common.base.Optional<Boolean> isRecurring, final com.google.common.base.Optional<org.joda.time.DateTime> lowStockDate, final com.google.common.base.Optional<java.math.BigDecimal> maxSaleQty, final com.google.common.base.Optional<String> metaDescription, final com.google.common.base.Optional<String> metaKeyword, final com.google.common.base.Optional<String> metaTitle, final com.google.common.base.Optional<java.math.BigDecimal> minimalPrice, final com.google.common.base.Optional<java.math.BigDecimal> minQty, final com.google.common.base.Optional<java.math.BigDecimal> minSaleQty, final com.google.common.base.Optional<String> model, final String name, final com.google.common.base.Optional<org.joda.time.DateTime> newsFromDate, final com.google.common.base.Optional<org.joda.time.DateTime> newsToDate, final com.google.common.base.Optional<java.math.BigDecimal> notifyStockQty, final com.google.common.base.Optional<java.math.BigDecimal> price, final com.google.common.base.Optional<java.math.BigDecimal> qty, final com.google.common.base.Optional<String> shippingPolicy, final String shortDescription, final String sku, final com.google.common.base.Optional<org.joda.time.DateTime> specialFromDate, final com.google.common.base.Optional<java.math.BigDecimal> specialPrice, final com.google.common.base.Optional<org.joda.time.DateTime> specialToDate, final String store, final com.google.common.base.Optional<com.yogento.api.models.catalog.product.magento.MagentoProductStatus> status, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> tags, final com.google.common.base.Optional<String> type, final com.google.common.base.Optional<org.joda.time.DateTime> updatedAt, final String urlKey, final com.google.common.base.Optional<String> urlPath, final com.google.common.collect.ImmutableSet<String> visibility, final com.google.common.base.Optional<java.math.BigDecimal> weight) {
        this.activationInformation = com.google.common.base.Preconditions.checkNotNull(activationInformation, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing activationInformation");
        this.backorders = backorders;
        this.children = com.google.common.base.Preconditions.checkNotNull(children, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing children");
        this.cost = com.google.common.base.Preconditions.checkNotNull(cost, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing cost");
        this.createdAt = com.google.common.base.Preconditions.checkNotNull(createdAt, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing createdAt");
        this.description = com.google.common.base.Preconditions.checkNotNull(description, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing description");
        this.images = com.google.common.base.Preconditions.checkNotNull(images, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing images");
        this.isInStock = isInStock;
        this.isQtyDecimal = isQtyDecimal;
        this.isRecurring = isRecurring;
        this.lowStockDate = com.google.common.base.Preconditions.checkNotNull(lowStockDate, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing lowStockDate");
        this.maxSaleQty = com.google.common.base.Preconditions.checkNotNull(maxSaleQty, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing maxSaleQty");
        this.metaDescription = com.google.common.base.Preconditions.checkNotNull(metaDescription, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing metaDescription");
        this.metaKeyword = com.google.common.base.Preconditions.checkNotNull(metaKeyword, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing metaKeyword");
        this.metaTitle = com.google.common.base.Preconditions.checkNotNull(metaTitle, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing metaTitle");
        this.minimalPrice = com.google.common.base.Preconditions.checkNotNull(minimalPrice, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing minimalPrice");
        this.minQty = com.google.common.base.Preconditions.checkNotNull(minQty, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing minQty");
        this.minSaleQty = com.google.common.base.Preconditions.checkNotNull(minSaleQty, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing minSaleQty");
        this.model = com.google.common.base.Preconditions.checkNotNull(model, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing model");
        this.name = com.google.common.base.Preconditions.checkNotNull(name, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing name");
        this.newsFromDate = com.google.common.base.Preconditions.checkNotNull(newsFromDate, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing newsFromDate");
        this.newsToDate = com.google.common.base.Preconditions.checkNotNull(newsToDate, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing newsToDate");
        this.notifyStockQty = com.google.common.base.Preconditions.checkNotNull(notifyStockQty, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing notifyStockQty");
        this.price = com.google.common.base.Preconditions.checkNotNull(price, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing price");
        this.qty = com.google.common.base.Preconditions.checkNotNull(qty, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing qty");
        this.shippingPolicy = com.google.common.base.Preconditions.checkNotNull(shippingPolicy, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing shippingPolicy");
        this.shortDescription = com.google.common.base.Preconditions.checkNotNull(shortDescription, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing shortDescription");
        this.sku = com.google.common.base.Preconditions.checkNotNull(sku, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing sku");
        this.specialFromDate = com.google.common.base.Preconditions.checkNotNull(specialFromDate, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing specialFromDate");
        this.specialPrice = com.google.common.base.Preconditions.checkNotNull(specialPrice, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing specialPrice");
        this.specialToDate = com.google.common.base.Preconditions.checkNotNull(specialToDate, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing specialToDate");
        this.store = com.google.common.base.Preconditions.checkNotNull(store, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing store");
        this.status = com.google.common.base.Preconditions.checkNotNull(status, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing status");
        this.tags = com.google.common.base.Preconditions.checkNotNull(tags, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing tags");
        this.type = com.google.common.base.Preconditions.checkNotNull(type, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing type");
        this.updatedAt = com.google.common.base.Preconditions.checkNotNull(updatedAt, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing updatedAt");
        this.urlKey = com.google.common.base.Preconditions.checkNotNull(urlKey, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing urlKey");
        this.urlPath = com.google.common.base.Preconditions.checkNotNull(urlPath, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing urlPath");
        this.visibility = com.google.common.base.Preconditions.checkNotNull(visibility, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing visibility");
        this.weight = com.google.common.base.Preconditions.checkNotNull(weight, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing weight");
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public int compareTo(final MagentoProduct other) {
        if (other == null) {
            throw new NullPointerException();
        }

        int result;
        if (this.activationInformation.isPresent()) {
            if (other.activationInformation.isPresent()) {
                result = this.activationInformation.get().compareTo(other.activationInformation.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.activationInformation.isPresent()) {
            return -1;
        }

        if (this.backorders.isPresent()) {
            if (other.backorders.isPresent()) {
                result = ((Integer)this.backorders.get()).compareTo(other.backorders.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.backorders.isPresent()) {
            return -1;
        }

        if (this.children.isPresent()) {
            if (other.children.isPresent()) {
                result = org.thryft.Comparators.compare(this.children.get(), other.children.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.children.isPresent()) {
            return -1;
        }

        if (this.cost.isPresent()) {
            if (other.cost.isPresent()) {
                result = this.cost.get().compareTo(other.cost.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.cost.isPresent()) {
            return -1;
        }

        if (this.createdAt.isPresent()) {
            if (other.createdAt.isPresent()) {
                result = this.createdAt.get().compareTo(other.createdAt.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.createdAt.isPresent()) {
            return -1;
        }

        if (this.description.isPresent()) {
            if (other.description.isPresent()) {
                result = this.description.get().compareTo(other.description.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.description.isPresent()) {
            return -1;
        }

        if (this.images.isPresent()) {
            if (other.images.isPresent()) {
                result = org.thryft.Comparators.compare(this.images.get(), other.images.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.images.isPresent()) {
            return -1;
        }

        if (this.isInStock.isPresent()) {
            if (other.isInStock.isPresent()) {
                result = ((Boolean)this.isInStock.get()).compareTo(other.isInStock.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.isInStock.isPresent()) {
            return -1;
        }

        if (this.isQtyDecimal.isPresent()) {
            if (other.isQtyDecimal.isPresent()) {
                result = ((Boolean)this.isQtyDecimal.get()).compareTo(other.isQtyDecimal.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.isQtyDecimal.isPresent()) {
            return -1;
        }

        if (this.isRecurring.isPresent()) {
            if (other.isRecurring.isPresent()) {
                result = ((Boolean)this.isRecurring.get()).compareTo(other.isRecurring.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.isRecurring.isPresent()) {
            return -1;
        }

        if (this.lowStockDate.isPresent()) {
            if (other.lowStockDate.isPresent()) {
                result = this.lowStockDate.get().compareTo(other.lowStockDate.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.lowStockDate.isPresent()) {
            return -1;
        }

        if (this.maxSaleQty.isPresent()) {
            if (other.maxSaleQty.isPresent()) {
                result = this.maxSaleQty.get().compareTo(other.maxSaleQty.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.maxSaleQty.isPresent()) {
            return -1;
        }

        if (this.metaDescription.isPresent()) {
            if (other.metaDescription.isPresent()) {
                result = this.metaDescription.get().compareTo(other.metaDescription.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.metaDescription.isPresent()) {
            return -1;
        }

        if (this.metaKeyword.isPresent()) {
            if (other.metaKeyword.isPresent()) {
                result = this.metaKeyword.get().compareTo(other.metaKeyword.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.metaKeyword.isPresent()) {
            return -1;
        }

        if (this.metaTitle.isPresent()) {
            if (other.metaTitle.isPresent()) {
                result = this.metaTitle.get().compareTo(other.metaTitle.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.metaTitle.isPresent()) {
            return -1;
        }

        if (this.minimalPrice.isPresent()) {
            if (other.minimalPrice.isPresent()) {
                result = this.minimalPrice.get().compareTo(other.minimalPrice.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.minimalPrice.isPresent()) {
            return -1;
        }

        if (this.minQty.isPresent()) {
            if (other.minQty.isPresent()) {
                result = this.minQty.get().compareTo(other.minQty.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.minQty.isPresent()) {
            return -1;
        }

        if (this.minSaleQty.isPresent()) {
            if (other.minSaleQty.isPresent()) {
                result = this.minSaleQty.get().compareTo(other.minSaleQty.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.minSaleQty.isPresent()) {
            return -1;
        }

        if (this.model.isPresent()) {
            if (other.model.isPresent()) {
                result = this.model.get().compareTo(other.model.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.model.isPresent()) {
            return -1;
        }

        result = this.name.compareTo(other.name);
        if (result != 0) {
            return result;
        }

        if (this.newsFromDate.isPresent()) {
            if (other.newsFromDate.isPresent()) {
                result = this.newsFromDate.get().compareTo(other.newsFromDate.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.newsFromDate.isPresent()) {
            return -1;
        }

        if (this.newsToDate.isPresent()) {
            if (other.newsToDate.isPresent()) {
                result = this.newsToDate.get().compareTo(other.newsToDate.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.newsToDate.isPresent()) {
            return -1;
        }

        if (this.notifyStockQty.isPresent()) {
            if (other.notifyStockQty.isPresent()) {
                result = this.notifyStockQty.get().compareTo(other.notifyStockQty.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.notifyStockQty.isPresent()) {
            return -1;
        }

        if (this.price.isPresent()) {
            if (other.price.isPresent()) {
                result = this.price.get().compareTo(other.price.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.price.isPresent()) {
            return -1;
        }

        if (this.qty.isPresent()) {
            if (other.qty.isPresent()) {
                result = this.qty.get().compareTo(other.qty.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.qty.isPresent()) {
            return -1;
        }

        if (this.shippingPolicy.isPresent()) {
            if (other.shippingPolicy.isPresent()) {
                result = this.shippingPolicy.get().compareTo(other.shippingPolicy.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.shippingPolicy.isPresent()) {
            return -1;
        }

        result = this.shortDescription.compareTo(other.shortDescription);
        if (result != 0) {
            return result;
        }

        result = this.sku.compareTo(other.sku);
        if (result != 0) {
            return result;
        }

        if (this.specialFromDate.isPresent()) {
            if (other.specialFromDate.isPresent()) {
                result = this.specialFromDate.get().compareTo(other.specialFromDate.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.specialFromDate.isPresent()) {
            return -1;
        }

        if (this.specialPrice.isPresent()) {
            if (other.specialPrice.isPresent()) {
                result = this.specialPrice.get().compareTo(other.specialPrice.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.specialPrice.isPresent()) {
            return -1;
        }

        if (this.specialToDate.isPresent()) {
            if (other.specialToDate.isPresent()) {
                result = this.specialToDate.get().compareTo(other.specialToDate.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.specialToDate.isPresent()) {
            return -1;
        }

        result = this.store.compareTo(other.store);
        if (result != 0) {
            return result;
        }

        if (this.status.isPresent()) {
            if (other.status.isPresent()) {
                result = this.status.get().compareTo(other.status.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.status.isPresent()) {
            return -1;
        }

        if (this.tags.isPresent()) {
            if (other.tags.isPresent()) {
                result = org.thryft.Comparators.compare(this.tags.get(), other.tags.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.tags.isPresent()) {
            return -1;
        }

        if (this.type.isPresent()) {
            if (other.type.isPresent()) {
                result = this.type.get().compareTo(other.type.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.type.isPresent()) {
            return -1;
        }

        if (this.updatedAt.isPresent()) {
            if (other.updatedAt.isPresent()) {
                result = this.updatedAt.get().compareTo(other.updatedAt.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.updatedAt.isPresent()) {
            return -1;
        }

        result = this.urlKey.compareTo(other.urlKey);
        if (result != 0) {
            return result;
        }

        if (this.urlPath.isPresent()) {
            if (other.urlPath.isPresent()) {
                result = this.urlPath.get().compareTo(other.urlPath.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.urlPath.isPresent()) {
            return -1;
        }

        result = org.thryft.Comparators.compare(this.visibility, other.visibility);
        if (result != 0) {
            return result;
        }

        if (this.weight.isPresent()) {
            if (other.weight.isPresent()) {
                result = this.weight.get().compareTo(other.weight.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.weight.isPresent()) {
            return -1;
        }

        return 0;
    }

    @Override
    public boolean equals(final Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof MagentoProduct)) {
            return false;
        }

        final MagentoProduct other = (MagentoProduct)otherObject;
        return
            getActivationInformation().equals(other.getActivationInformation()) &&
            getBackorders().equals(other.getBackorders()) &&
            getChildren().equals(other.getChildren()) &&
            getCost().equals(other.getCost()) &&
            getCreatedAt().equals(other.getCreatedAt()) &&
            getDescription().equals(other.getDescription()) &&
            getImages().equals(other.getImages()) &&
            getIsInStock().equals(other.getIsInStock()) &&
            getIsQtyDecimal().equals(other.getIsQtyDecimal()) &&
            getIsRecurring().equals(other.getIsRecurring()) &&
            getLowStockDate().equals(other.getLowStockDate()) &&
            getMaxSaleQty().equals(other.getMaxSaleQty()) &&
            getMetaDescription().equals(other.getMetaDescription()) &&
            getMetaKeyword().equals(other.getMetaKeyword()) &&
            getMetaTitle().equals(other.getMetaTitle()) &&
            getMinimalPrice().equals(other.getMinimalPrice()) &&
            getMinQty().equals(other.getMinQty()) &&
            getMinSaleQty().equals(other.getMinSaleQty()) &&
            getModel().equals(other.getModel()) &&
            getName().equals(other.getName()) &&
            getNewsFromDate().equals(other.getNewsFromDate()) &&
            getNewsToDate().equals(other.getNewsToDate()) &&
            getNotifyStockQty().equals(other.getNotifyStockQty()) &&
            getPrice().equals(other.getPrice()) &&
            getQty().equals(other.getQty()) &&
            getShippingPolicy().equals(other.getShippingPolicy()) &&
            getShortDescription().equals(other.getShortDescription()) &&
            getSku().equals(other.getSku()) &&
            getSpecialFromDate().equals(other.getSpecialFromDate()) &&
            getSpecialPrice().equals(other.getSpecialPrice()) &&
            getSpecialToDate().equals(other.getSpecialToDate()) &&
            getStore().equals(other.getStore()) &&
            getStatus().equals(other.getStatus()) &&
            getTags().equals(other.getTags()) &&
            getType().equals(other.getType()) &&
            getUpdatedAt().equals(other.getUpdatedAt()) &&
            getUrlKey().equals(other.getUrlKey()) &&
            getUrlPath().equals(other.getUrlPath()) &&
            getVisibility().equals(other.getVisibility()) &&
            getWeight().equals(other.getWeight());
    }

    public static MagentoProduct fake() {
        return fakeBuilder().build();
    }

    public static Builder fakeBuilder() {
        Builder builder = new Builder();
        builder.setActivationInformation(org.thryft.Faker.Lorem.word());
        builder.setBackorders(org.thryft.Faker.randomI32());
        builder.setCost(org.thryft.Faker.randomDecimal());
        builder.setCreatedAt(org.joda.time.DateTime.now());
        builder.setDescription(org.thryft.Faker.Lorem.word());
        builder.setImages(com.google.common.collect.ImmutableSet.of(com.yogento.api.models.catalog.product.magento.MagentoProductImage.fake()));
        builder.setIsInStock(org.thryft.Faker.randomBool());
        builder.setIsQtyDecimal(org.thryft.Faker.randomBool());
        builder.setIsRecurring(org.thryft.Faker.randomBool());
        builder.setLowStockDate(org.joda.time.DateTime.now());
        builder.setMaxSaleQty(org.thryft.Faker.randomDecimal());
        builder.setMetaDescription(org.thryft.Faker.Lorem.word());
        builder.setMetaKeyword(org.thryft.Faker.Lorem.word());
        builder.setMetaTitle(org.thryft.Faker.Lorem.word());
        builder.setMinimalPrice(org.thryft.Faker.randomDecimal());
        builder.setMinQty(org.thryft.Faker.randomDecimal());
        builder.setMinSaleQty(org.thryft.Faker.randomDecimal());
        builder.setModel(org.thryft.Faker.Lorem.word());
        builder.setName(org.thryft.Faker.Lorem.word());
        builder.setNewsFromDate(org.joda.time.DateTime.now());
        builder.setNewsToDate(org.joda.time.DateTime.now());
        builder.setNotifyStockQty(org.thryft.Faker.randomDecimal());
        builder.setPrice(org.thryft.Faker.randomDecimal());
        builder.setQty(org.thryft.Faker.randomDecimal());
        builder.setShippingPolicy(org.thryft.Faker.Lorem.word());
        builder.setShortDescription(org.thryft.Faker.Lorem.word());
        builder.setSku(org.thryft.Faker.Lorem.word());
        builder.setSpecialFromDate(org.joda.time.DateTime.now());
        builder.setSpecialPrice(org.thryft.Faker.randomDecimal());
        builder.setSpecialToDate(org.joda.time.DateTime.now());
        builder.setStore(org.thryft.Faker.Lorem.word());
        builder.setStatus(org.thryft.Faker.randomEnum(com.google.common.collect.ImmutableList.of(com.yogento.api.models.catalog.product.magento.MagentoProductStatus.DISABLED, com.yogento.api.models.catalog.product.magento.MagentoProductStatus.ENABLED)));
        builder.setTags(com.google.common.collect.ImmutableSet.of(org.thryft.Faker.Lorem.word()));
        builder.setType(org.thryft.Faker.Lorem.word());
        builder.setUpdatedAt(org.joda.time.DateTime.now());
        builder.setUrlKey(org.thryft.Faker.Lorem.word());
        builder.setUrlPath(org.thryft.Faker.Lorem.word());
        builder.setVisibility(com.google.common.collect.ImmutableSet.of(org.thryft.Faker.Lorem.word()));
        builder.setWeight(org.thryft.Faker.randomDecimal());
        return builder;
    }

    public Object get(final String fieldName) {
        if (fieldName.equals("activation_information")) {
            return getActivationInformation();
        } else if (fieldName.equals("backorders")) {
            return getBackorders();
        } else if (fieldName.equals("children")) {
            return getChildren();
        } else if (fieldName.equals("cost")) {
            return getCost();
        } else if (fieldName.equals("created_at")) {
            return getCreatedAt();
        } else if (fieldName.equals("description")) {
            return getDescription();
        } else if (fieldName.equals("images")) {
            return getImages();
        } else if (fieldName.equals("is_in_stock")) {
            return getIsInStock();
        } else if (fieldName.equals("is_qty_decimal")) {
            return getIsQtyDecimal();
        } else if (fieldName.equals("is_recurring")) {
            return getIsRecurring();
        } else if (fieldName.equals("low_stock_date")) {
            return getLowStockDate();
        } else if (fieldName.equals("max_sale_qty")) {
            return getMaxSaleQty();
        } else if (fieldName.equals("meta_description")) {
            return getMetaDescription();
        } else if (fieldName.equals("meta_keyword")) {
            return getMetaKeyword();
        } else if (fieldName.equals("meta_title")) {
            return getMetaTitle();
        } else if (fieldName.equals("minimal_price")) {
            return getMinimalPrice();
        } else if (fieldName.equals("min_qty")) {
            return getMinQty();
        } else if (fieldName.equals("min_sale_qty")) {
            return getMinSaleQty();
        } else if (fieldName.equals("model")) {
            return getModel();
        } else if (fieldName.equals("name")) {
            return getName();
        } else if (fieldName.equals("news_from_date")) {
            return getNewsFromDate();
        } else if (fieldName.equals("news_to_date")) {
            return getNewsToDate();
        } else if (fieldName.equals("notify_stock_qty")) {
            return getNotifyStockQty();
        } else if (fieldName.equals("price")) {
            return getPrice();
        } else if (fieldName.equals("qty")) {
            return getQty();
        } else if (fieldName.equals("shipping_policy")) {
            return getShippingPolicy();
        } else if (fieldName.equals("short_description")) {
            return getShortDescription();
        } else if (fieldName.equals("sku")) {
            return getSku();
        } else if (fieldName.equals("special_from_date")) {
            return getSpecialFromDate();
        } else if (fieldName.equals("special_price")) {
            return getSpecialPrice();
        } else if (fieldName.equals("special_to_date")) {
            return getSpecialToDate();
        } else if (fieldName.equals("store")) {
            return getStore();
        } else if (fieldName.equals("status")) {
            return getStatus();
        } else if (fieldName.equals("tags")) {
            return getTags();
        } else if (fieldName.equals("type")) {
            return getType();
        } else if (fieldName.equals("updated_at")) {
            return getUpdatedAt();
        } else if (fieldName.equals("url_key")) {
            return getUrlKey();
        } else if (fieldName.equals("url_path")) {
            return getUrlPath();
        } else if (fieldName.equals("visibility")) {
            return getVisibility();
        } else if (fieldName.equals("weight")) {
            return getWeight();
        }
        throw new IllegalArgumentException(fieldName);
    }

    public final com.google.common.base.Optional<String> getActivationInformation() {
        return activationInformation;
    }

    public final com.google.common.base.Optional<Integer> getBackorders() {
        return backorders;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProduct>> getChildren() {
        return children;
    }

    public final com.google.common.base.Optional<java.math.BigDecimal> getCost() {
        return cost;
    }

    public final com.google.common.base.Optional<org.joda.time.DateTime> getCreatedAt() {
        return createdAt;
    }

    public final com.google.common.base.Optional<String> getDescription() {
        return description;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProductImage>> getImages() {
        return images;
    }

    public final com.google.common.base.Optional<Boolean> getIsInStock() {
        return isInStock;
    }

    public final com.google.common.base.Optional<Boolean> getIsQtyDecimal() {
        return isQtyDecimal;
    }

    public final com.google.common.base.Optional<Boolean> getIsRecurring() {
        return isRecurring;
    }

    public final com.google.common.base.Optional<org.joda.time.DateTime> getLowStockDate() {
        return lowStockDate;
    }

    public final com.google.common.base.Optional<java.math.BigDecimal> getMaxSaleQty() {
        return maxSaleQty;
    }

    public final com.google.common.base.Optional<String> getMetaDescription() {
        return metaDescription;
    }

    public final com.google.common.base.Optional<String> getMetaKeyword() {
        return metaKeyword;
    }

    public final com.google.common.base.Optional<String> getMetaTitle() {
        return metaTitle;
    }

    public final com.google.common.base.Optional<java.math.BigDecimal> getMinQty() {
        return minQty;
    }

    public final com.google.common.base.Optional<java.math.BigDecimal> getMinSaleQty() {
        return minSaleQty;
    }

    public final com.google.common.base.Optional<java.math.BigDecimal> getMinimalPrice() {
        return minimalPrice;
    }

    public final com.google.common.base.Optional<String> getModel() {
        return model;
    }

    public final String getName() {
        return name;
    }

    public final com.google.common.base.Optional<org.joda.time.DateTime> getNewsFromDate() {
        return newsFromDate;
    }

    public final com.google.common.base.Optional<org.joda.time.DateTime> getNewsToDate() {
        return newsToDate;
    }

    public final com.google.common.base.Optional<java.math.BigDecimal> getNotifyStockQty() {
        return notifyStockQty;
    }

    /**
     * Optional in 1.3
     */
    public final com.google.common.base.Optional<java.math.BigDecimal> getPrice() {
        return price;
    }

    public final com.google.common.base.Optional<java.math.BigDecimal> getQty() {
        return qty;
    }

    public final com.google.common.base.Optional<String> getShippingPolicy() {
        return shippingPolicy;
    }

    public final String getShortDescription() {
        return shortDescription;
    }

    public final String getSku() {
        return sku;
    }

    public final com.google.common.base.Optional<org.joda.time.DateTime> getSpecialFromDate() {
        return specialFromDate;
    }

    public final com.google.common.base.Optional<java.math.BigDecimal> getSpecialPrice() {
        return specialPrice;
    }

    public final com.google.common.base.Optional<org.joda.time.DateTime> getSpecialToDate() {
        return specialToDate;
    }

    /**
     * Optional in 1.3
     */
    public final com.google.common.base.Optional<com.yogento.api.models.catalog.product.magento.MagentoProductStatus> getStatus() {
        return status;
    }

    public final String getStore() {
        return store;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getTags() {
        return tags;
    }

    /**
     * Optional in 1.3
     */
    public final com.google.common.base.Optional<String> getType() {
        return type;
    }

    public final com.google.common.base.Optional<org.joda.time.DateTime> getUpdatedAt() {
        return updatedAt;
    }

    public final String getUrlKey() {
        return urlKey;
    }

    /**
     * Optional in 1.3
     */
    public final com.google.common.base.Optional<String> getUrlPath() {
        return urlPath;
    }

    /**
     * Formerly an enum; the strings differ between Magento versions
     */
    public final com.google.common.collect.ImmutableSet<String> getVisibility() {
        return visibility;
    }

    public final com.google.common.base.Optional<java.math.BigDecimal> getWeight() {
        return weight;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        if (getActivationInformation().isPresent()) {
            hashCode = 31 * hashCode + getActivationInformation().get().hashCode();
        }
        if (getBackorders().isPresent()) {
            hashCode = 31 * hashCode + ((int)getBackorders().get());
        }
        if (getChildren().isPresent()) {
            hashCode = 31 * hashCode + getChildren().get().hashCode();
        }
        if (getCost().isPresent()) {
            hashCode = 31 * hashCode + getCost().get().hashCode();
        }
        if (getCreatedAt().isPresent()) {
            hashCode = 31 * hashCode + getCreatedAt().get().hashCode();
        }
        if (getDescription().isPresent()) {
            hashCode = 31 * hashCode + getDescription().get().hashCode();
        }
        if (getImages().isPresent()) {
            hashCode = 31 * hashCode + getImages().get().hashCode();
        }
        if (getIsInStock().isPresent()) {
            hashCode = 31 * hashCode + (getIsInStock().get() ? 1 : 0);
        }
        if (getIsQtyDecimal().isPresent()) {
            hashCode = 31 * hashCode + (getIsQtyDecimal().get() ? 1 : 0);
        }
        if (getIsRecurring().isPresent()) {
            hashCode = 31 * hashCode + (getIsRecurring().get() ? 1 : 0);
        }
        if (getLowStockDate().isPresent()) {
            hashCode = 31 * hashCode + getLowStockDate().get().hashCode();
        }
        if (getMaxSaleQty().isPresent()) {
            hashCode = 31 * hashCode + getMaxSaleQty().get().hashCode();
        }
        if (getMetaDescription().isPresent()) {
            hashCode = 31 * hashCode + getMetaDescription().get().hashCode();
        }
        if (getMetaKeyword().isPresent()) {
            hashCode = 31 * hashCode + getMetaKeyword().get().hashCode();
        }
        if (getMetaTitle().isPresent()) {
            hashCode = 31 * hashCode + getMetaTitle().get().hashCode();
        }
        if (getMinimalPrice().isPresent()) {
            hashCode = 31 * hashCode + getMinimalPrice().get().hashCode();
        }
        if (getMinQty().isPresent()) {
            hashCode = 31 * hashCode + getMinQty().get().hashCode();
        }
        if (getMinSaleQty().isPresent()) {
            hashCode = 31 * hashCode + getMinSaleQty().get().hashCode();
        }
        if (getModel().isPresent()) {
            hashCode = 31 * hashCode + getModel().get().hashCode();
        }
        hashCode = 31 * hashCode + getName().hashCode();
        if (getNewsFromDate().isPresent()) {
            hashCode = 31 * hashCode + getNewsFromDate().get().hashCode();
        }
        if (getNewsToDate().isPresent()) {
            hashCode = 31 * hashCode + getNewsToDate().get().hashCode();
        }
        if (getNotifyStockQty().isPresent()) {
            hashCode = 31 * hashCode + getNotifyStockQty().get().hashCode();
        }
        if (getPrice().isPresent()) {
            hashCode = 31 * hashCode + getPrice().get().hashCode();
        }
        if (getQty().isPresent()) {
            hashCode = 31 * hashCode + getQty().get().hashCode();
        }
        if (getShippingPolicy().isPresent()) {
            hashCode = 31 * hashCode + getShippingPolicy().get().hashCode();
        }
        hashCode = 31 * hashCode + getShortDescription().hashCode();
        hashCode = 31 * hashCode + getSku().hashCode();
        if (getSpecialFromDate().isPresent()) {
            hashCode = 31 * hashCode + getSpecialFromDate().get().hashCode();
        }
        if (getSpecialPrice().isPresent()) {
            hashCode = 31 * hashCode + getSpecialPrice().get().hashCode();
        }
        if (getSpecialToDate().isPresent()) {
            hashCode = 31 * hashCode + getSpecialToDate().get().hashCode();
        }
        hashCode = 31 * hashCode + getStore().hashCode();
        if (getStatus().isPresent()) {
            hashCode = 31 * hashCode + getStatus().get().ordinal();
        }
        if (getTags().isPresent()) {
            hashCode = 31 * hashCode + getTags().get().hashCode();
        }
        if (getType().isPresent()) {
            hashCode = 31 * hashCode + getType().get().hashCode();
        }
        if (getUpdatedAt().isPresent()) {
            hashCode = 31 * hashCode + getUpdatedAt().get().hashCode();
        }
        hashCode = 31 * hashCode + getUrlKey().hashCode();
        if (getUrlPath().isPresent()) {
            hashCode = 31 * hashCode + getUrlPath().get().hashCode();
        }
        hashCode = 31 * hashCode + getVisibility().hashCode();
        if (getWeight().isPresent()) {
            hashCode = 31 * hashCode + getWeight().get().hashCode();
        }
        return hashCode;
    }

    public MagentoProduct replaceActivationInformation(final com.google.common.base.Optional<String> activationInformation) {
        return new MagentoProduct(activationInformation, this.backorders, this.children, this.cost, this.createdAt, this.description, this.images, this.isInStock, this.isQtyDecimal, this.isRecurring, this.lowStockDate, this.maxSaleQty, this.metaDescription, this.metaKeyword, this.metaTitle, this.minimalPrice, this.minQty, this.minSaleQty, this.model, this.name, this.newsFromDate, this.newsToDate, this.notifyStockQty, this.price, this.qty, this.shippingPolicy, this.shortDescription, this.sku, this.specialFromDate, this.specialPrice, this.specialToDate, this.store, this.status, this.tags, this.type, this.updatedAt, this.urlKey, this.urlPath, this.visibility, this.weight);
    }

    public MagentoProduct replaceActivationInformation(final String activationInformation) {
        return replaceActivationInformation(com.google.common.base.Optional.fromNullable(activationInformation));
    }

    public MagentoProduct replaceBackorders(final com.google.common.base.Optional<Integer> backorders) {
        return new MagentoProduct(this.activationInformation, backorders, this.children, this.cost, this.createdAt, this.description, this.images, this.isInStock, this.isQtyDecimal, this.isRecurring, this.lowStockDate, this.maxSaleQty, this.metaDescription, this.metaKeyword, this.metaTitle, this.minimalPrice, this.minQty, this.minSaleQty, this.model, this.name, this.newsFromDate, this.newsToDate, this.notifyStockQty, this.price, this.qty, this.shippingPolicy, this.shortDescription, this.sku, this.specialFromDate, this.specialPrice, this.specialToDate, this.store, this.status, this.tags, this.type, this.updatedAt, this.urlKey, this.urlPath, this.visibility, this.weight);
    }

    public MagentoProduct replaceBackorders(final int backorders) {
        return replaceBackorders(com.google.common.base.Optional.fromNullable(backorders));
    }

    public MagentoProduct replaceChildren(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProduct>> children) {
        return new MagentoProduct(this.activationInformation, this.backorders, children, this.cost, this.createdAt, this.description, this.images, this.isInStock, this.isQtyDecimal, this.isRecurring, this.lowStockDate, this.maxSaleQty, this.metaDescription, this.metaKeyword, this.metaTitle, this.minimalPrice, this.minQty, this.minSaleQty, this.model, this.name, this.newsFromDate, this.newsToDate, this.notifyStockQty, this.price, this.qty, this.shippingPolicy, this.shortDescription, this.sku, this.specialFromDate, this.specialPrice, this.specialToDate, this.store, this.status, this.tags, this.type, this.updatedAt, this.urlKey, this.urlPath, this.visibility, this.weight);
    }

    public MagentoProduct replaceChildren(final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProduct> children) {
        return replaceChildren(com.google.common.base.Optional.fromNullable(children));
    }

    public MagentoProduct replaceCost(final com.google.common.base.Optional<java.math.BigDecimal> cost) {
        return new MagentoProduct(this.activationInformation, this.backorders, this.children, cost, this.createdAt, this.description, this.images, this.isInStock, this.isQtyDecimal, this.isRecurring, this.lowStockDate, this.maxSaleQty, this.metaDescription, this.metaKeyword, this.metaTitle, this.minimalPrice, this.minQty, this.minSaleQty, this.model, this.name, this.newsFromDate, this.newsToDate, this.notifyStockQty, this.price, this.qty, this.shippingPolicy, this.shortDescription, this.sku, this.specialFromDate, this.specialPrice, this.specialToDate, this.store, this.status, this.tags, this.type, this.updatedAt, this.urlKey, this.urlPath, this.visibility, this.weight);
    }

    public MagentoProduct replaceCost(final java.math.BigDecimal cost) {
        return replaceCost(com.google.common.base.Optional.fromNullable(cost));
    }

    public MagentoProduct replaceCreatedAt(final com.google.common.base.Optional<org.joda.time.DateTime> createdAt) {
        return new MagentoProduct(this.activationInformation, this.backorders, this.children, this.cost, createdAt, this.description, this.images, this.isInStock, this.isQtyDecimal, this.isRecurring, this.lowStockDate, this.maxSaleQty, this.metaDescription, this.metaKeyword, this.metaTitle, this.minimalPrice, this.minQty, this.minSaleQty, this.model, this.name, this.newsFromDate, this.newsToDate, this.notifyStockQty, this.price, this.qty, this.shippingPolicy, this.shortDescription, this.sku, this.specialFromDate, this.specialPrice, this.specialToDate, this.store, this.status, this.tags, this.type, this.updatedAt, this.urlKey, this.urlPath, this.visibility, this.weight);
    }

    public MagentoProduct replaceCreatedAt(final org.joda.time.DateTime createdAt) {
        return replaceCreatedAt(com.google.common.base.Optional.fromNullable(createdAt));
    }

    public MagentoProduct replaceDescription(final com.google.common.base.Optional<String> description) {
        return new MagentoProduct(this.activationInformation, this.backorders, this.children, this.cost, this.createdAt, description, this.images, this.isInStock, this.isQtyDecimal, this.isRecurring, this.lowStockDate, this.maxSaleQty, this.metaDescription, this.metaKeyword, this.metaTitle, this.minimalPrice, this.minQty, this.minSaleQty, this.model, this.name, this.newsFromDate, this.newsToDate, this.notifyStockQty, this.price, this.qty, this.shippingPolicy, this.shortDescription, this.sku, this.specialFromDate, this.specialPrice, this.specialToDate, this.store, this.status, this.tags, this.type, this.updatedAt, this.urlKey, this.urlPath, this.visibility, this.weight);
    }

    public MagentoProduct replaceDescription(final String description) {
        return replaceDescription(com.google.common.base.Optional.fromNullable(description));
    }

    public MagentoProduct replaceImages(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProductImage>> images) {
        return new MagentoProduct(this.activationInformation, this.backorders, this.children, this.cost, this.createdAt, this.description, images, this.isInStock, this.isQtyDecimal, this.isRecurring, this.lowStockDate, this.maxSaleQty, this.metaDescription, this.metaKeyword, this.metaTitle, this.minimalPrice, this.minQty, this.minSaleQty, this.model, this.name, this.newsFromDate, this.newsToDate, this.notifyStockQty, this.price, this.qty, this.shippingPolicy, this.shortDescription, this.sku, this.specialFromDate, this.specialPrice, this.specialToDate, this.store, this.status, this.tags, this.type, this.updatedAt, this.urlKey, this.urlPath, this.visibility, this.weight);
    }

    public MagentoProduct replaceImages(final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProductImage> images) {
        return replaceImages(com.google.common.base.Optional.fromNullable(images));
    }

    public MagentoProduct replaceIsInStock(final com.google.common.base.Optional<Boolean> isInStock) {
        return new MagentoProduct(this.activationInformation, this.backorders, this.children, this.cost, this.createdAt, this.description, this.images, isInStock, this.isQtyDecimal, this.isRecurring, this.lowStockDate, this.maxSaleQty, this.metaDescription, this.metaKeyword, this.metaTitle, this.minimalPrice, this.minQty, this.minSaleQty, this.model, this.name, this.newsFromDate, this.newsToDate, this.notifyStockQty, this.price, this.qty, this.shippingPolicy, this.shortDescription, this.sku, this.specialFromDate, this.specialPrice, this.specialToDate, this.store, this.status, this.tags, this.type, this.updatedAt, this.urlKey, this.urlPath, this.visibility, this.weight);
    }

    public MagentoProduct replaceIsInStock(final boolean isInStock) {
        return replaceIsInStock(com.google.common.base.Optional.fromNullable(isInStock));
    }

    public MagentoProduct replaceIsQtyDecimal(final com.google.common.base.Optional<Boolean> isQtyDecimal) {
        return new MagentoProduct(this.activationInformation, this.backorders, this.children, this.cost, this.createdAt, this.description, this.images, this.isInStock, isQtyDecimal, this.isRecurring, this.lowStockDate, this.maxSaleQty, this.metaDescription, this.metaKeyword, this.metaTitle, this.minimalPrice, this.minQty, this.minSaleQty, this.model, this.name, this.newsFromDate, this.newsToDate, this.notifyStockQty, this.price, this.qty, this.shippingPolicy, this.shortDescription, this.sku, this.specialFromDate, this.specialPrice, this.specialToDate, this.store, this.status, this.tags, this.type, this.updatedAt, this.urlKey, this.urlPath, this.visibility, this.weight);
    }

    public MagentoProduct replaceIsQtyDecimal(final boolean isQtyDecimal) {
        return replaceIsQtyDecimal(com.google.common.base.Optional.fromNullable(isQtyDecimal));
    }

    public MagentoProduct replaceIsRecurring(final com.google.common.base.Optional<Boolean> isRecurring) {
        return new MagentoProduct(this.activationInformation, this.backorders, this.children, this.cost, this.createdAt, this.description, this.images, this.isInStock, this.isQtyDecimal, isRecurring, this.lowStockDate, this.maxSaleQty, this.metaDescription, this.metaKeyword, this.metaTitle, this.minimalPrice, this.minQty, this.minSaleQty, this.model, this.name, this.newsFromDate, this.newsToDate, this.notifyStockQty, this.price, this.qty, this.shippingPolicy, this.shortDescription, this.sku, this.specialFromDate, this.specialPrice, this.specialToDate, this.store, this.status, this.tags, this.type, this.updatedAt, this.urlKey, this.urlPath, this.visibility, this.weight);
    }

    public MagentoProduct replaceIsRecurring(final boolean isRecurring) {
        return replaceIsRecurring(com.google.common.base.Optional.fromNullable(isRecurring));
    }

    public MagentoProduct replaceLowStockDate(final com.google.common.base.Optional<org.joda.time.DateTime> lowStockDate) {
        return new MagentoProduct(this.activationInformation, this.backorders, this.children, this.cost, this.createdAt, this.description, this.images, this.isInStock, this.isQtyDecimal, this.isRecurring, lowStockDate, this.maxSaleQty, this.metaDescription, this.metaKeyword, this.metaTitle, this.minimalPrice, this.minQty, this.minSaleQty, this.model, this.name, this.newsFromDate, this.newsToDate, this.notifyStockQty, this.price, this.qty, this.shippingPolicy, this.shortDescription, this.sku, this.specialFromDate, this.specialPrice, this.specialToDate, this.store, this.status, this.tags, this.type, this.updatedAt, this.urlKey, this.urlPath, this.visibility, this.weight);
    }

    public MagentoProduct replaceLowStockDate(final org.joda.time.DateTime lowStockDate) {
        return replaceLowStockDate(com.google.common.base.Optional.fromNullable(lowStockDate));
    }

    public MagentoProduct replaceMaxSaleQty(final com.google.common.base.Optional<java.math.BigDecimal> maxSaleQty) {
        return new MagentoProduct(this.activationInformation, this.backorders, this.children, this.cost, this.createdAt, this.description, this.images, this.isInStock, this.isQtyDecimal, this.isRecurring, this.lowStockDate, maxSaleQty, this.metaDescription, this.metaKeyword, this.metaTitle, this.minimalPrice, this.minQty, this.minSaleQty, this.model, this.name, this.newsFromDate, this.newsToDate, this.notifyStockQty, this.price, this.qty, this.shippingPolicy, this.shortDescription, this.sku, this.specialFromDate, this.specialPrice, this.specialToDate, this.store, this.status, this.tags, this.type, this.updatedAt, this.urlKey, this.urlPath, this.visibility, this.weight);
    }

    public MagentoProduct replaceMaxSaleQty(final java.math.BigDecimal maxSaleQty) {
        return replaceMaxSaleQty(com.google.common.base.Optional.fromNullable(maxSaleQty));
    }

    public MagentoProduct replaceMetaDescription(final com.google.common.base.Optional<String> metaDescription) {
        return new MagentoProduct(this.activationInformation, this.backorders, this.children, this.cost, this.createdAt, this.description, this.images, this.isInStock, this.isQtyDecimal, this.isRecurring, this.lowStockDate, this.maxSaleQty, metaDescription, this.metaKeyword, this.metaTitle, this.minimalPrice, this.minQty, this.minSaleQty, this.model, this.name, this.newsFromDate, this.newsToDate, this.notifyStockQty, this.price, this.qty, this.shippingPolicy, this.shortDescription, this.sku, this.specialFromDate, this.specialPrice, this.specialToDate, this.store, this.status, this.tags, this.type, this.updatedAt, this.urlKey, this.urlPath, this.visibility, this.weight);
    }

    public MagentoProduct replaceMetaDescription(final String metaDescription) {
        return replaceMetaDescription(com.google.common.base.Optional.fromNullable(metaDescription));
    }

    public MagentoProduct replaceMetaKeyword(final com.google.common.base.Optional<String> metaKeyword) {
        return new MagentoProduct(this.activationInformation, this.backorders, this.children, this.cost, this.createdAt, this.description, this.images, this.isInStock, this.isQtyDecimal, this.isRecurring, this.lowStockDate, this.maxSaleQty, this.metaDescription, metaKeyword, this.metaTitle, this.minimalPrice, this.minQty, this.minSaleQty, this.model, this.name, this.newsFromDate, this.newsToDate, this.notifyStockQty, this.price, this.qty, this.shippingPolicy, this.shortDescription, this.sku, this.specialFromDate, this.specialPrice, this.specialToDate, this.store, this.status, this.tags, this.type, this.updatedAt, this.urlKey, this.urlPath, this.visibility, this.weight);
    }

    public MagentoProduct replaceMetaKeyword(final String metaKeyword) {
        return replaceMetaKeyword(com.google.common.base.Optional.fromNullable(metaKeyword));
    }

    public MagentoProduct replaceMetaTitle(final com.google.common.base.Optional<String> metaTitle) {
        return new MagentoProduct(this.activationInformation, this.backorders, this.children, this.cost, this.createdAt, this.description, this.images, this.isInStock, this.isQtyDecimal, this.isRecurring, this.lowStockDate, this.maxSaleQty, this.metaDescription, this.metaKeyword, metaTitle, this.minimalPrice, this.minQty, this.minSaleQty, this.model, this.name, this.newsFromDate, this.newsToDate, this.notifyStockQty, this.price, this.qty, this.shippingPolicy, this.shortDescription, this.sku, this.specialFromDate, this.specialPrice, this.specialToDate, this.store, this.status, this.tags, this.type, this.updatedAt, this.urlKey, this.urlPath, this.visibility, this.weight);
    }

    public MagentoProduct replaceMetaTitle(final String metaTitle) {
        return replaceMetaTitle(com.google.common.base.Optional.fromNullable(metaTitle));
    }

    public MagentoProduct replaceMinQty(final com.google.common.base.Optional<java.math.BigDecimal> minQty) {
        return new MagentoProduct(this.activationInformation, this.backorders, this.children, this.cost, this.createdAt, this.description, this.images, this.isInStock, this.isQtyDecimal, this.isRecurring, this.lowStockDate, this.maxSaleQty, this.metaDescription, this.metaKeyword, this.metaTitle, this.minimalPrice, minQty, this.minSaleQty, this.model, this.name, this.newsFromDate, this.newsToDate, this.notifyStockQty, this.price, this.qty, this.shippingPolicy, this.shortDescription, this.sku, this.specialFromDate, this.specialPrice, this.specialToDate, this.store, this.status, this.tags, this.type, this.updatedAt, this.urlKey, this.urlPath, this.visibility, this.weight);
    }

    public MagentoProduct replaceMinQty(final java.math.BigDecimal minQty) {
        return replaceMinQty(com.google.common.base.Optional.fromNullable(minQty));
    }

    public MagentoProduct replaceMinSaleQty(final com.google.common.base.Optional<java.math.BigDecimal> minSaleQty) {
        return new MagentoProduct(this.activationInformation, this.backorders, this.children, this.cost, this.createdAt, this.description, this.images, this.isInStock, this.isQtyDecimal, this.isRecurring, this.lowStockDate, this.maxSaleQty, this.metaDescription, this.metaKeyword, this.metaTitle, this.minimalPrice, this.minQty, minSaleQty, this.model, this.name, this.newsFromDate, this.newsToDate, this.notifyStockQty, this.price, this.qty, this.shippingPolicy, this.shortDescription, this.sku, this.specialFromDate, this.specialPrice, this.specialToDate, this.store, this.status, this.tags, this.type, this.updatedAt, this.urlKey, this.urlPath, this.visibility, this.weight);
    }

    public MagentoProduct replaceMinSaleQty(final java.math.BigDecimal minSaleQty) {
        return replaceMinSaleQty(com.google.common.base.Optional.fromNullable(minSaleQty));
    }

    public MagentoProduct replaceMinimalPrice(final com.google.common.base.Optional<java.math.BigDecimal> minimalPrice) {
        return new MagentoProduct(this.activationInformation, this.backorders, this.children, this.cost, this.createdAt, this.description, this.images, this.isInStock, this.isQtyDecimal, this.isRecurring, this.lowStockDate, this.maxSaleQty, this.metaDescription, this.metaKeyword, this.metaTitle, minimalPrice, this.minQty, this.minSaleQty, this.model, this.name, this.newsFromDate, this.newsToDate, this.notifyStockQty, this.price, this.qty, this.shippingPolicy, this.shortDescription, this.sku, this.specialFromDate, this.specialPrice, this.specialToDate, this.store, this.status, this.tags, this.type, this.updatedAt, this.urlKey, this.urlPath, this.visibility, this.weight);
    }

    public MagentoProduct replaceMinimalPrice(final java.math.BigDecimal minimalPrice) {
        return replaceMinimalPrice(com.google.common.base.Optional.fromNullable(minimalPrice));
    }

    public MagentoProduct replaceModel(final com.google.common.base.Optional<String> model) {
        return new MagentoProduct(this.activationInformation, this.backorders, this.children, this.cost, this.createdAt, this.description, this.images, this.isInStock, this.isQtyDecimal, this.isRecurring, this.lowStockDate, this.maxSaleQty, this.metaDescription, this.metaKeyword, this.metaTitle, this.minimalPrice, this.minQty, this.minSaleQty, model, this.name, this.newsFromDate, this.newsToDate, this.notifyStockQty, this.price, this.qty, this.shippingPolicy, this.shortDescription, this.sku, this.specialFromDate, this.specialPrice, this.specialToDate, this.store, this.status, this.tags, this.type, this.updatedAt, this.urlKey, this.urlPath, this.visibility, this.weight);
    }

    public MagentoProduct replaceModel(final String model) {
        return replaceModel(com.google.common.base.Optional.fromNullable(model));
    }

    public MagentoProduct replaceName(final String name) {
        return new MagentoProduct(this.activationInformation, this.backorders, this.children, this.cost, this.createdAt, this.description, this.images, this.isInStock, this.isQtyDecimal, this.isRecurring, this.lowStockDate, this.maxSaleQty, this.metaDescription, this.metaKeyword, this.metaTitle, this.minimalPrice, this.minQty, this.minSaleQty, this.model, name, this.newsFromDate, this.newsToDate, this.notifyStockQty, this.price, this.qty, this.shippingPolicy, this.shortDescription, this.sku, this.specialFromDate, this.specialPrice, this.specialToDate, this.store, this.status, this.tags, this.type, this.updatedAt, this.urlKey, this.urlPath, this.visibility, this.weight);
    }

    public MagentoProduct replaceNewsFromDate(final com.google.common.base.Optional<org.joda.time.DateTime> newsFromDate) {
        return new MagentoProduct(this.activationInformation, this.backorders, this.children, this.cost, this.createdAt, this.description, this.images, this.isInStock, this.isQtyDecimal, this.isRecurring, this.lowStockDate, this.maxSaleQty, this.metaDescription, this.metaKeyword, this.metaTitle, this.minimalPrice, this.minQty, this.minSaleQty, this.model, this.name, newsFromDate, this.newsToDate, this.notifyStockQty, this.price, this.qty, this.shippingPolicy, this.shortDescription, this.sku, this.specialFromDate, this.specialPrice, this.specialToDate, this.store, this.status, this.tags, this.type, this.updatedAt, this.urlKey, this.urlPath, this.visibility, this.weight);
    }

    public MagentoProduct replaceNewsFromDate(final org.joda.time.DateTime newsFromDate) {
        return replaceNewsFromDate(com.google.common.base.Optional.fromNullable(newsFromDate));
    }

    public MagentoProduct replaceNewsToDate(final com.google.common.base.Optional<org.joda.time.DateTime> newsToDate) {
        return new MagentoProduct(this.activationInformation, this.backorders, this.children, this.cost, this.createdAt, this.description, this.images, this.isInStock, this.isQtyDecimal, this.isRecurring, this.lowStockDate, this.maxSaleQty, this.metaDescription, this.metaKeyword, this.metaTitle, this.minimalPrice, this.minQty, this.minSaleQty, this.model, this.name, this.newsFromDate, newsToDate, this.notifyStockQty, this.price, this.qty, this.shippingPolicy, this.shortDescription, this.sku, this.specialFromDate, this.specialPrice, this.specialToDate, this.store, this.status, this.tags, this.type, this.updatedAt, this.urlKey, this.urlPath, this.visibility, this.weight);
    }

    public MagentoProduct replaceNewsToDate(final org.joda.time.DateTime newsToDate) {
        return replaceNewsToDate(com.google.common.base.Optional.fromNullable(newsToDate));
    }

    public MagentoProduct replaceNotifyStockQty(final com.google.common.base.Optional<java.math.BigDecimal> notifyStockQty) {
        return new MagentoProduct(this.activationInformation, this.backorders, this.children, this.cost, this.createdAt, this.description, this.images, this.isInStock, this.isQtyDecimal, this.isRecurring, this.lowStockDate, this.maxSaleQty, this.metaDescription, this.metaKeyword, this.metaTitle, this.minimalPrice, this.minQty, this.minSaleQty, this.model, this.name, this.newsFromDate, this.newsToDate, notifyStockQty, this.price, this.qty, this.shippingPolicy, this.shortDescription, this.sku, this.specialFromDate, this.specialPrice, this.specialToDate, this.store, this.status, this.tags, this.type, this.updatedAt, this.urlKey, this.urlPath, this.visibility, this.weight);
    }

    public MagentoProduct replaceNotifyStockQty(final java.math.BigDecimal notifyStockQty) {
        return replaceNotifyStockQty(com.google.common.base.Optional.fromNullable(notifyStockQty));
    }

    public MagentoProduct replacePrice(final com.google.common.base.Optional<java.math.BigDecimal> price) {
        return new MagentoProduct(this.activationInformation, this.backorders, this.children, this.cost, this.createdAt, this.description, this.images, this.isInStock, this.isQtyDecimal, this.isRecurring, this.lowStockDate, this.maxSaleQty, this.metaDescription, this.metaKeyword, this.metaTitle, this.minimalPrice, this.minQty, this.minSaleQty, this.model, this.name, this.newsFromDate, this.newsToDate, this.notifyStockQty, price, this.qty, this.shippingPolicy, this.shortDescription, this.sku, this.specialFromDate, this.specialPrice, this.specialToDate, this.store, this.status, this.tags, this.type, this.updatedAt, this.urlKey, this.urlPath, this.visibility, this.weight);
    }

    public MagentoProduct replacePrice(final java.math.BigDecimal price) {
        return replacePrice(com.google.common.base.Optional.fromNullable(price));
    }

    public MagentoProduct replaceQty(final com.google.common.base.Optional<java.math.BigDecimal> qty) {
        return new MagentoProduct(this.activationInformation, this.backorders, this.children, this.cost, this.createdAt, this.description, this.images, this.isInStock, this.isQtyDecimal, this.isRecurring, this.lowStockDate, this.maxSaleQty, this.metaDescription, this.metaKeyword, this.metaTitle, this.minimalPrice, this.minQty, this.minSaleQty, this.model, this.name, this.newsFromDate, this.newsToDate, this.notifyStockQty, this.price, qty, this.shippingPolicy, this.shortDescription, this.sku, this.specialFromDate, this.specialPrice, this.specialToDate, this.store, this.status, this.tags, this.type, this.updatedAt, this.urlKey, this.urlPath, this.visibility, this.weight);
    }

    public MagentoProduct replaceQty(final java.math.BigDecimal qty) {
        return replaceQty(com.google.common.base.Optional.fromNullable(qty));
    }

    public MagentoProduct replaceShippingPolicy(final com.google.common.base.Optional<String> shippingPolicy) {
        return new MagentoProduct(this.activationInformation, this.backorders, this.children, this.cost, this.createdAt, this.description, this.images, this.isInStock, this.isQtyDecimal, this.isRecurring, this.lowStockDate, this.maxSaleQty, this.metaDescription, this.metaKeyword, this.metaTitle, this.minimalPrice, this.minQty, this.minSaleQty, this.model, this.name, this.newsFromDate, this.newsToDate, this.notifyStockQty, this.price, this.qty, shippingPolicy, this.shortDescription, this.sku, this.specialFromDate, this.specialPrice, this.specialToDate, this.store, this.status, this.tags, this.type, this.updatedAt, this.urlKey, this.urlPath, this.visibility, this.weight);
    }

    public MagentoProduct replaceShippingPolicy(final String shippingPolicy) {
        return replaceShippingPolicy(com.google.common.base.Optional.fromNullable(shippingPolicy));
    }

    public MagentoProduct replaceShortDescription(final String shortDescription) {
        return new MagentoProduct(this.activationInformation, this.backorders, this.children, this.cost, this.createdAt, this.description, this.images, this.isInStock, this.isQtyDecimal, this.isRecurring, this.lowStockDate, this.maxSaleQty, this.metaDescription, this.metaKeyword, this.metaTitle, this.minimalPrice, this.minQty, this.minSaleQty, this.model, this.name, this.newsFromDate, this.newsToDate, this.notifyStockQty, this.price, this.qty, this.shippingPolicy, shortDescription, this.sku, this.specialFromDate, this.specialPrice, this.specialToDate, this.store, this.status, this.tags, this.type, this.updatedAt, this.urlKey, this.urlPath, this.visibility, this.weight);
    }

    public MagentoProduct replaceSku(final String sku) {
        return new MagentoProduct(this.activationInformation, this.backorders, this.children, this.cost, this.createdAt, this.description, this.images, this.isInStock, this.isQtyDecimal, this.isRecurring, this.lowStockDate, this.maxSaleQty, this.metaDescription, this.metaKeyword, this.metaTitle, this.minimalPrice, this.minQty, this.minSaleQty, this.model, this.name, this.newsFromDate, this.newsToDate, this.notifyStockQty, this.price, this.qty, this.shippingPolicy, this.shortDescription, sku, this.specialFromDate, this.specialPrice, this.specialToDate, this.store, this.status, this.tags, this.type, this.updatedAt, this.urlKey, this.urlPath, this.visibility, this.weight);
    }

    public MagentoProduct replaceSpecialFromDate(final com.google.common.base.Optional<org.joda.time.DateTime> specialFromDate) {
        return new MagentoProduct(this.activationInformation, this.backorders, this.children, this.cost, this.createdAt, this.description, this.images, this.isInStock, this.isQtyDecimal, this.isRecurring, this.lowStockDate, this.maxSaleQty, this.metaDescription, this.metaKeyword, this.metaTitle, this.minimalPrice, this.minQty, this.minSaleQty, this.model, this.name, this.newsFromDate, this.newsToDate, this.notifyStockQty, this.price, this.qty, this.shippingPolicy, this.shortDescription, this.sku, specialFromDate, this.specialPrice, this.specialToDate, this.store, this.status, this.tags, this.type, this.updatedAt, this.urlKey, this.urlPath, this.visibility, this.weight);
    }

    public MagentoProduct replaceSpecialFromDate(final org.joda.time.DateTime specialFromDate) {
        return replaceSpecialFromDate(com.google.common.base.Optional.fromNullable(specialFromDate));
    }

    public MagentoProduct replaceSpecialPrice(final com.google.common.base.Optional<java.math.BigDecimal> specialPrice) {
        return new MagentoProduct(this.activationInformation, this.backorders, this.children, this.cost, this.createdAt, this.description, this.images, this.isInStock, this.isQtyDecimal, this.isRecurring, this.lowStockDate, this.maxSaleQty, this.metaDescription, this.metaKeyword, this.metaTitle, this.minimalPrice, this.minQty, this.minSaleQty, this.model, this.name, this.newsFromDate, this.newsToDate, this.notifyStockQty, this.price, this.qty, this.shippingPolicy, this.shortDescription, this.sku, this.specialFromDate, specialPrice, this.specialToDate, this.store, this.status, this.tags, this.type, this.updatedAt, this.urlKey, this.urlPath, this.visibility, this.weight);
    }

    public MagentoProduct replaceSpecialPrice(final java.math.BigDecimal specialPrice) {
        return replaceSpecialPrice(com.google.common.base.Optional.fromNullable(specialPrice));
    }

    public MagentoProduct replaceSpecialToDate(final com.google.common.base.Optional<org.joda.time.DateTime> specialToDate) {
        return new MagentoProduct(this.activationInformation, this.backorders, this.children, this.cost, this.createdAt, this.description, this.images, this.isInStock, this.isQtyDecimal, this.isRecurring, this.lowStockDate, this.maxSaleQty, this.metaDescription, this.metaKeyword, this.metaTitle, this.minimalPrice, this.minQty, this.minSaleQty, this.model, this.name, this.newsFromDate, this.newsToDate, this.notifyStockQty, this.price, this.qty, this.shippingPolicy, this.shortDescription, this.sku, this.specialFromDate, this.specialPrice, specialToDate, this.store, this.status, this.tags, this.type, this.updatedAt, this.urlKey, this.urlPath, this.visibility, this.weight);
    }

    public MagentoProduct replaceSpecialToDate(final org.joda.time.DateTime specialToDate) {
        return replaceSpecialToDate(com.google.common.base.Optional.fromNullable(specialToDate));
    }

    public MagentoProduct replaceStatus(final com.google.common.base.Optional<com.yogento.api.models.catalog.product.magento.MagentoProductStatus> status) {
        return new MagentoProduct(this.activationInformation, this.backorders, this.children, this.cost, this.createdAt, this.description, this.images, this.isInStock, this.isQtyDecimal, this.isRecurring, this.lowStockDate, this.maxSaleQty, this.metaDescription, this.metaKeyword, this.metaTitle, this.minimalPrice, this.minQty, this.minSaleQty, this.model, this.name, this.newsFromDate, this.newsToDate, this.notifyStockQty, this.price, this.qty, this.shippingPolicy, this.shortDescription, this.sku, this.specialFromDate, this.specialPrice, this.specialToDate, this.store, status, this.tags, this.type, this.updatedAt, this.urlKey, this.urlPath, this.visibility, this.weight);
    }

    public MagentoProduct replaceStatus(final com.yogento.api.models.catalog.product.magento.MagentoProductStatus status) {
        return replaceStatus(com.google.common.base.Optional.fromNullable(status));
    }

    public MagentoProduct replaceStore(final String store) {
        return new MagentoProduct(this.activationInformation, this.backorders, this.children, this.cost, this.createdAt, this.description, this.images, this.isInStock, this.isQtyDecimal, this.isRecurring, this.lowStockDate, this.maxSaleQty, this.metaDescription, this.metaKeyword, this.metaTitle, this.minimalPrice, this.minQty, this.minSaleQty, this.model, this.name, this.newsFromDate, this.newsToDate, this.notifyStockQty, this.price, this.qty, this.shippingPolicy, this.shortDescription, this.sku, this.specialFromDate, this.specialPrice, this.specialToDate, store, this.status, this.tags, this.type, this.updatedAt, this.urlKey, this.urlPath, this.visibility, this.weight);
    }

    public MagentoProduct replaceTags(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> tags) {
        return new MagentoProduct(this.activationInformation, this.backorders, this.children, this.cost, this.createdAt, this.description, this.images, this.isInStock, this.isQtyDecimal, this.isRecurring, this.lowStockDate, this.maxSaleQty, this.metaDescription, this.metaKeyword, this.metaTitle, this.minimalPrice, this.minQty, this.minSaleQty, this.model, this.name, this.newsFromDate, this.newsToDate, this.notifyStockQty, this.price, this.qty, this.shippingPolicy, this.shortDescription, this.sku, this.specialFromDate, this.specialPrice, this.specialToDate, this.store, this.status, tags, this.type, this.updatedAt, this.urlKey, this.urlPath, this.visibility, this.weight);
    }

    public MagentoProduct replaceTags(final com.google.common.collect.ImmutableSet<String> tags) {
        return replaceTags(com.google.common.base.Optional.fromNullable(tags));
    }

    public MagentoProduct replaceType(final com.google.common.base.Optional<String> type) {
        return new MagentoProduct(this.activationInformation, this.backorders, this.children, this.cost, this.createdAt, this.description, this.images, this.isInStock, this.isQtyDecimal, this.isRecurring, this.lowStockDate, this.maxSaleQty, this.metaDescription, this.metaKeyword, this.metaTitle, this.minimalPrice, this.minQty, this.minSaleQty, this.model, this.name, this.newsFromDate, this.newsToDate, this.notifyStockQty, this.price, this.qty, this.shippingPolicy, this.shortDescription, this.sku, this.specialFromDate, this.specialPrice, this.specialToDate, this.store, this.status, this.tags, type, this.updatedAt, this.urlKey, this.urlPath, this.visibility, this.weight);
    }

    public MagentoProduct replaceType(final String type) {
        return replaceType(com.google.common.base.Optional.fromNullable(type));
    }

    public MagentoProduct replaceUpdatedAt(final com.google.common.base.Optional<org.joda.time.DateTime> updatedAt) {
        return new MagentoProduct(this.activationInformation, this.backorders, this.children, this.cost, this.createdAt, this.description, this.images, this.isInStock, this.isQtyDecimal, this.isRecurring, this.lowStockDate, this.maxSaleQty, this.metaDescription, this.metaKeyword, this.metaTitle, this.minimalPrice, this.minQty, this.minSaleQty, this.model, this.name, this.newsFromDate, this.newsToDate, this.notifyStockQty, this.price, this.qty, this.shippingPolicy, this.shortDescription, this.sku, this.specialFromDate, this.specialPrice, this.specialToDate, this.store, this.status, this.tags, this.type, updatedAt, this.urlKey, this.urlPath, this.visibility, this.weight);
    }

    public MagentoProduct replaceUpdatedAt(final org.joda.time.DateTime updatedAt) {
        return replaceUpdatedAt(com.google.common.base.Optional.fromNullable(updatedAt));
    }

    public MagentoProduct replaceUrlKey(final String urlKey) {
        return new MagentoProduct(this.activationInformation, this.backorders, this.children, this.cost, this.createdAt, this.description, this.images, this.isInStock, this.isQtyDecimal, this.isRecurring, this.lowStockDate, this.maxSaleQty, this.metaDescription, this.metaKeyword, this.metaTitle, this.minimalPrice, this.minQty, this.minSaleQty, this.model, this.name, this.newsFromDate, this.newsToDate, this.notifyStockQty, this.price, this.qty, this.shippingPolicy, this.shortDescription, this.sku, this.specialFromDate, this.specialPrice, this.specialToDate, this.store, this.status, this.tags, this.type, this.updatedAt, urlKey, this.urlPath, this.visibility, this.weight);
    }

    public MagentoProduct replaceUrlPath(final com.google.common.base.Optional<String> urlPath) {
        return new MagentoProduct(this.activationInformation, this.backorders, this.children, this.cost, this.createdAt, this.description, this.images, this.isInStock, this.isQtyDecimal, this.isRecurring, this.lowStockDate, this.maxSaleQty, this.metaDescription, this.metaKeyword, this.metaTitle, this.minimalPrice, this.minQty, this.minSaleQty, this.model, this.name, this.newsFromDate, this.newsToDate, this.notifyStockQty, this.price, this.qty, this.shippingPolicy, this.shortDescription, this.sku, this.specialFromDate, this.specialPrice, this.specialToDate, this.store, this.status, this.tags, this.type, this.updatedAt, this.urlKey, urlPath, this.visibility, this.weight);
    }

    public MagentoProduct replaceUrlPath(final String urlPath) {
        return replaceUrlPath(com.google.common.base.Optional.fromNullable(urlPath));
    }

    public MagentoProduct replaceVisibility(final com.google.common.collect.ImmutableSet<String> visibility) {
        return new MagentoProduct(this.activationInformation, this.backorders, this.children, this.cost, this.createdAt, this.description, this.images, this.isInStock, this.isQtyDecimal, this.isRecurring, this.lowStockDate, this.maxSaleQty, this.metaDescription, this.metaKeyword, this.metaTitle, this.minimalPrice, this.minQty, this.minSaleQty, this.model, this.name, this.newsFromDate, this.newsToDate, this.notifyStockQty, this.price, this.qty, this.shippingPolicy, this.shortDescription, this.sku, this.specialFromDate, this.specialPrice, this.specialToDate, this.store, this.status, this.tags, this.type, this.updatedAt, this.urlKey, this.urlPath, visibility, this.weight);
    }

    public MagentoProduct replaceWeight(final com.google.common.base.Optional<java.math.BigDecimal> weight) {
        return new MagentoProduct(this.activationInformation, this.backorders, this.children, this.cost, this.createdAt, this.description, this.images, this.isInStock, this.isQtyDecimal, this.isRecurring, this.lowStockDate, this.maxSaleQty, this.metaDescription, this.metaKeyword, this.metaTitle, this.minimalPrice, this.minQty, this.minSaleQty, this.model, this.name, this.newsFromDate, this.newsToDate, this.notifyStockQty, this.price, this.qty, this.shippingPolicy, this.shortDescription, this.sku, this.specialFromDate, this.specialPrice, this.specialToDate, this.store, this.status, this.tags, this.type, this.updatedAt, this.urlKey, this.urlPath, this.visibility, weight);
    }

    public MagentoProduct replaceWeight(final java.math.BigDecimal weight) {
        return replaceWeight(com.google.common.base.Optional.fromNullable(weight));
    }

    @Override
    public String toString() {
        final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
        if (getActivationInformation().isPresent()) {
            helper.add("activation_information", getActivationInformation());
        }
        if (getBackorders().isPresent()) {
            helper.add("backorders", getBackorders());
        }
        if (getChildren().isPresent()) {
            helper.add("children", getChildren());
        }
        if (getCost().isPresent()) {
            helper.add("cost", getCost());
        }
        if (getCreatedAt().isPresent()) {
            helper.add("created_at", getCreatedAt());
        }
        if (getDescription().isPresent()) {
            helper.add("description", getDescription());
        }
        if (getImages().isPresent()) {
            helper.add("images", getImages());
        }
        if (getIsInStock().isPresent()) {
            helper.add("is_in_stock", getIsInStock());
        }
        if (getIsQtyDecimal().isPresent()) {
            helper.add("is_qty_decimal", getIsQtyDecimal());
        }
        if (getIsRecurring().isPresent()) {
            helper.add("is_recurring", getIsRecurring());
        }
        if (getLowStockDate().isPresent()) {
            helper.add("low_stock_date", getLowStockDate());
        }
        if (getMaxSaleQty().isPresent()) {
            helper.add("max_sale_qty", getMaxSaleQty());
        }
        if (getMetaDescription().isPresent()) {
            helper.add("meta_description", getMetaDescription());
        }
        if (getMetaKeyword().isPresent()) {
            helper.add("meta_keyword", getMetaKeyword());
        }
        if (getMetaTitle().isPresent()) {
            helper.add("meta_title", getMetaTitle());
        }
        if (getMinimalPrice().isPresent()) {
            helper.add("minimal_price", getMinimalPrice());
        }
        if (getMinQty().isPresent()) {
            helper.add("min_qty", getMinQty());
        }
        if (getMinSaleQty().isPresent()) {
            helper.add("min_sale_qty", getMinSaleQty());
        }
        if (getModel().isPresent()) {
            helper.add("model", getModel());
        }
        helper.add("name", getName());
        if (getNewsFromDate().isPresent()) {
            helper.add("news_from_date", getNewsFromDate());
        }
        if (getNewsToDate().isPresent()) {
            helper.add("news_to_date", getNewsToDate());
        }
        if (getNotifyStockQty().isPresent()) {
            helper.add("notify_stock_qty", getNotifyStockQty());
        }
        if (getPrice().isPresent()) {
            helper.add("price", getPrice());
        }
        if (getQty().isPresent()) {
            helper.add("qty", getQty());
        }
        if (getShippingPolicy().isPresent()) {
            helper.add("shipping_policy", getShippingPolicy());
        }
        helper.add("short_description", getShortDescription());
        helper.add("sku", getSku());
        if (getSpecialFromDate().isPresent()) {
            helper.add("special_from_date", getSpecialFromDate());
        }
        if (getSpecialPrice().isPresent()) {
            helper.add("special_price", getSpecialPrice());
        }
        if (getSpecialToDate().isPresent()) {
            helper.add("special_to_date", getSpecialToDate());
        }
        helper.add("store", getStore());
        if (getStatus().isPresent()) {
            helper.add("status", getStatus());
        }
        if (getTags().isPresent()) {
            helper.add("tags", getTags());
        }
        if (getType().isPresent()) {
            helper.add("type", getType());
        }
        if (getUpdatedAt().isPresent()) {
            helper.add("updated_at", getUpdatedAt());
        }
        helper.add("url_key", getUrlKey());
        if (getUrlPath().isPresent()) {
            helper.add("url_path", getUrlPath());
        }
        helper.add("visibility", getVisibility());
        if (getWeight().isPresent()) {
            helper.add("weight", getWeight());
        }
        return helper.toString();
    }

    @Override
    public void write(final org.thryft.protocol.TProtocol oprot) throws java.io.IOException {
        write(oprot, org.thryft.protocol.TType.STRUCT);
    }

    public void write(final org.thryft.protocol.TProtocol oprot, final byte writeAsTType) throws java.io.IOException {
        switch (writeAsTType) {
            case org.thryft.protocol.TType.VOID:
            case org.thryft.protocol.TType.LIST:
                oprot.writeListBegin(new org.thryft.protocol.TList(org.thryft.protocol.TType.VOID, 40));

                if (getActivationInformation().isPresent()) {
                    oprot.writeString(getActivationInformation().get());
                } else {
                    oprot.writeNull();
                }

                if (getBackorders().isPresent()) {
                    oprot.writeI32(getBackorders().get());
                } else {
                    oprot.writeNull();
                }

                if (getChildren().isPresent()) {
                    oprot.writeSetBegin(new org.thryft.protocol.TSet(org.thryft.protocol.TType.STRUCT, getChildren().get().size()));
                    for (final com.yogento.api.models.catalog.product.magento.MagentoProduct _iter0 : getChildren().get()) {
                        _iter0.write(oprot);
                    }
                    oprot.writeSetEnd();
                } else {
                    oprot.writeNull();
                }

                if (getCost().isPresent()) {
                    oprot.writeDecimal(getCost().get());
                } else {
                    oprot.writeNull();
                }

                if (getCreatedAt().isPresent()) {
                    oprot.writeDateTime(getCreatedAt().get());
                } else {
                    oprot.writeNull();
                }

                if (getDescription().isPresent()) {
                    oprot.writeString(getDescription().get());
                } else {
                    oprot.writeNull();
                }

                if (getImages().isPresent()) {
                    oprot.writeSetBegin(new org.thryft.protocol.TSet(org.thryft.protocol.TType.STRUCT, getImages().get().size()));
                    for (final com.yogento.api.models.catalog.product.magento.MagentoProductImage _iter0 : getImages().get()) {
                        _iter0.write(oprot);
                    }
                    oprot.writeSetEnd();
                } else {
                    oprot.writeNull();
                }

                if (getIsInStock().isPresent()) {
                    oprot.writeBool(getIsInStock().get());
                } else {
                    oprot.writeNull();
                }

                if (getIsQtyDecimal().isPresent()) {
                    oprot.writeBool(getIsQtyDecimal().get());
                } else {
                    oprot.writeNull();
                }

                if (getIsRecurring().isPresent()) {
                    oprot.writeBool(getIsRecurring().get());
                } else {
                    oprot.writeNull();
                }

                if (getLowStockDate().isPresent()) {
                    oprot.writeDateTime(getLowStockDate().get());
                } else {
                    oprot.writeNull();
                }

                if (getMaxSaleQty().isPresent()) {
                    oprot.writeDecimal(getMaxSaleQty().get());
                } else {
                    oprot.writeNull();
                }

                if (getMetaDescription().isPresent()) {
                    oprot.writeString(getMetaDescription().get());
                } else {
                    oprot.writeNull();
                }

                if (getMetaKeyword().isPresent()) {
                    oprot.writeString(getMetaKeyword().get());
                } else {
                    oprot.writeNull();
                }

                if (getMetaTitle().isPresent()) {
                    oprot.writeString(getMetaTitle().get());
                } else {
                    oprot.writeNull();
                }

                if (getMinimalPrice().isPresent()) {
                    oprot.writeDecimal(getMinimalPrice().get());
                } else {
                    oprot.writeNull();
                }

                if (getMinQty().isPresent()) {
                    oprot.writeDecimal(getMinQty().get());
                } else {
                    oprot.writeNull();
                }

                if (getMinSaleQty().isPresent()) {
                    oprot.writeDecimal(getMinSaleQty().get());
                } else {
                    oprot.writeNull();
                }

                if (getModel().isPresent()) {
                    oprot.writeString(getModel().get());
                } else {
                    oprot.writeNull();
                }

                oprot.writeString(getName());

                if (getNewsFromDate().isPresent()) {
                    oprot.writeDateTime(getNewsFromDate().get());
                } else {
                    oprot.writeNull();
                }

                if (getNewsToDate().isPresent()) {
                    oprot.writeDateTime(getNewsToDate().get());
                } else {
                    oprot.writeNull();
                }

                if (getNotifyStockQty().isPresent()) {
                    oprot.writeDecimal(getNotifyStockQty().get());
                } else {
                    oprot.writeNull();
                }

                if (getPrice().isPresent()) {
                    oprot.writeDecimal(getPrice().get());
                } else {
                    oprot.writeNull();
                }

                if (getQty().isPresent()) {
                    oprot.writeDecimal(getQty().get());
                } else {
                    oprot.writeNull();
                }

                if (getShippingPolicy().isPresent()) {
                    oprot.writeString(getShippingPolicy().get());
                } else {
                    oprot.writeNull();
                }

                oprot.writeString(getShortDescription());

                oprot.writeString(getSku());

                if (getSpecialFromDate().isPresent()) {
                    oprot.writeDateTime(getSpecialFromDate().get());
                } else {
                    oprot.writeNull();
                }

                if (getSpecialPrice().isPresent()) {
                    oprot.writeDecimal(getSpecialPrice().get());
                } else {
                    oprot.writeNull();
                }

                if (getSpecialToDate().isPresent()) {
                    oprot.writeDateTime(getSpecialToDate().get());
                } else {
                    oprot.writeNull();
                }

                oprot.writeString(getStore());

                if (getStatus().isPresent()) {
                    oprot.writeEnum(getStatus().get());
                } else {
                    oprot.writeNull();
                }

                if (getTags().isPresent()) {
                    oprot.writeSetBegin(new org.thryft.protocol.TSet(org.thryft.protocol.TType.STRING, getTags().get().size()));
                    for (final String _iter0 : getTags().get()) {
                        oprot.writeString(_iter0);
                    }
                    oprot.writeSetEnd();
                } else {
                    oprot.writeNull();
                }

                if (getType().isPresent()) {
                    oprot.writeString(getType().get());
                } else {
                    oprot.writeNull();
                }

                if (getUpdatedAt().isPresent()) {
                    oprot.writeDateTime(getUpdatedAt().get());
                } else {
                    oprot.writeNull();
                }

                oprot.writeString(getUrlKey());

                if (getUrlPath().isPresent()) {
                    oprot.writeString(getUrlPath().get());
                } else {
                    oprot.writeNull();
                }

                oprot.writeSetBegin(new org.thryft.protocol.TSet(org.thryft.protocol.TType.STRING, getVisibility().size()));
                for (final String _iter0 : getVisibility()) {
                    oprot.writeString(_iter0);
                }
                oprot.writeSetEnd();

                if (getWeight().isPresent()) {
                    oprot.writeDecimal(getWeight().get());
                } else {
                    oprot.writeNull();
                }

                oprot.writeListEnd();
                break;

            case org.thryft.protocol.TType.STRUCT:
            default:
                oprot.writeStructBegin(new org.thryft.protocol.TStruct("MagentoProduct"));

                if (getActivationInformation().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("activation_information", org.thryft.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getActivationInformation().get());
                    oprot.writeFieldEnd();
                }

                if (getBackorders().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("backorders", org.thryft.protocol.TType.I32, (short)-1));
                    oprot.writeI32(getBackorders().get());
                    oprot.writeFieldEnd();
                }

                if (getChildren().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("children", org.thryft.protocol.TType.SET, (short)-1));
                    oprot.writeSetBegin(new org.thryft.protocol.TSet(org.thryft.protocol.TType.STRUCT, getChildren().get().size()));
                    for (final com.yogento.api.models.catalog.product.magento.MagentoProduct _iter0 : getChildren().get()) {
                        _iter0.write(oprot);
                    }
                    oprot.writeSetEnd();
                    oprot.writeFieldEnd();
                }

                if (getCost().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("cost", org.thryft.protocol.TType.STRUCT, (short)-1));
                    oprot.writeDecimal(getCost().get());
                    oprot.writeFieldEnd();
                }

                if (getCreatedAt().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("created_at", org.thryft.protocol.TType.STRUCT, (short)-1));
                    oprot.writeDateTime(getCreatedAt().get());
                    oprot.writeFieldEnd();
                }

                if (getDescription().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("description", org.thryft.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getDescription().get());
                    oprot.writeFieldEnd();
                }

                if (getImages().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("images", org.thryft.protocol.TType.SET, (short)-1));
                    oprot.writeSetBegin(new org.thryft.protocol.TSet(org.thryft.protocol.TType.STRUCT, getImages().get().size()));
                    for (final com.yogento.api.models.catalog.product.magento.MagentoProductImage _iter0 : getImages().get()) {
                        _iter0.write(oprot);
                    }
                    oprot.writeSetEnd();
                    oprot.writeFieldEnd();
                }

                if (getIsInStock().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("is_in_stock", org.thryft.protocol.TType.BOOL, (short)-1));
                    oprot.writeBool(getIsInStock().get());
                    oprot.writeFieldEnd();
                }

                if (getIsQtyDecimal().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("is_qty_decimal", org.thryft.protocol.TType.BOOL, (short)-1));
                    oprot.writeBool(getIsQtyDecimal().get());
                    oprot.writeFieldEnd();
                }

                if (getIsRecurring().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("is_recurring", org.thryft.protocol.TType.BOOL, (short)-1));
                    oprot.writeBool(getIsRecurring().get());
                    oprot.writeFieldEnd();
                }

                if (getLowStockDate().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("low_stock_date", org.thryft.protocol.TType.STRUCT, (short)-1));
                    oprot.writeDateTime(getLowStockDate().get());
                    oprot.writeFieldEnd();
                }

                if (getMaxSaleQty().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("max_sale_qty", org.thryft.protocol.TType.STRUCT, (short)-1));
                    oprot.writeDecimal(getMaxSaleQty().get());
                    oprot.writeFieldEnd();
                }

                if (getMetaDescription().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("meta_description", org.thryft.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getMetaDescription().get());
                    oprot.writeFieldEnd();
                }

                if (getMetaKeyword().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("meta_keyword", org.thryft.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getMetaKeyword().get());
                    oprot.writeFieldEnd();
                }

                if (getMetaTitle().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("meta_title", org.thryft.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getMetaTitle().get());
                    oprot.writeFieldEnd();
                }

                if (getMinimalPrice().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("minimal_price", org.thryft.protocol.TType.STRUCT, (short)-1));
                    oprot.writeDecimal(getMinimalPrice().get());
                    oprot.writeFieldEnd();
                }

                if (getMinQty().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("min_qty", org.thryft.protocol.TType.STRUCT, (short)-1));
                    oprot.writeDecimal(getMinQty().get());
                    oprot.writeFieldEnd();
                }

                if (getMinSaleQty().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("min_sale_qty", org.thryft.protocol.TType.STRUCT, (short)-1));
                    oprot.writeDecimal(getMinSaleQty().get());
                    oprot.writeFieldEnd();
                }

                if (getModel().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("model", org.thryft.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getModel().get());
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldBegin(new org.thryft.protocol.TField("name", org.thryft.protocol.TType.STRING, (short)-1));
                oprot.writeString(getName());
                oprot.writeFieldEnd();

                if (getNewsFromDate().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("news_from_date", org.thryft.protocol.TType.STRUCT, (short)-1));
                    oprot.writeDateTime(getNewsFromDate().get());
                    oprot.writeFieldEnd();
                }

                if (getNewsToDate().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("news_to_date", org.thryft.protocol.TType.STRUCT, (short)-1));
                    oprot.writeDateTime(getNewsToDate().get());
                    oprot.writeFieldEnd();
                }

                if (getNotifyStockQty().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("notify_stock_qty", org.thryft.protocol.TType.STRUCT, (short)-1));
                    oprot.writeDecimal(getNotifyStockQty().get());
                    oprot.writeFieldEnd();
                }

                if (getPrice().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("price", org.thryft.protocol.TType.STRUCT, (short)-1));
                    oprot.writeDecimal(getPrice().get());
                    oprot.writeFieldEnd();
                }

                if (getQty().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("qty", org.thryft.protocol.TType.STRUCT, (short)-1));
                    oprot.writeDecimal(getQty().get());
                    oprot.writeFieldEnd();
                }

                if (getShippingPolicy().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("shipping_policy", org.thryft.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getShippingPolicy().get());
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldBegin(new org.thryft.protocol.TField("short_description", org.thryft.protocol.TType.STRING, (short)-1));
                oprot.writeString(getShortDescription());
                oprot.writeFieldEnd();

                oprot.writeFieldBegin(new org.thryft.protocol.TField("sku", org.thryft.protocol.TType.STRING, (short)-1));
                oprot.writeString(getSku());
                oprot.writeFieldEnd();

                if (getSpecialFromDate().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("special_from_date", org.thryft.protocol.TType.STRUCT, (short)-1));
                    oprot.writeDateTime(getSpecialFromDate().get());
                    oprot.writeFieldEnd();
                }

                if (getSpecialPrice().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("special_price", org.thryft.protocol.TType.STRUCT, (short)-1));
                    oprot.writeDecimal(getSpecialPrice().get());
                    oprot.writeFieldEnd();
                }

                if (getSpecialToDate().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("special_to_date", org.thryft.protocol.TType.STRUCT, (short)-1));
                    oprot.writeDateTime(getSpecialToDate().get());
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldBegin(new org.thryft.protocol.TField("store", org.thryft.protocol.TType.STRING, (short)-1));
                oprot.writeString(getStore());
                oprot.writeFieldEnd();

                if (getStatus().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("status", org.thryft.protocol.TType.STRING, (short)-1));
                    oprot.writeEnum(getStatus().get());
                    oprot.writeFieldEnd();
                }

                if (getTags().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("tags", org.thryft.protocol.TType.SET, (short)-1));
                    oprot.writeSetBegin(new org.thryft.protocol.TSet(org.thryft.protocol.TType.STRING, getTags().get().size()));
                    for (final String _iter0 : getTags().get()) {
                        oprot.writeString(_iter0);
                    }
                    oprot.writeSetEnd();
                    oprot.writeFieldEnd();
                }

                if (getType().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("type", org.thryft.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getType().get());
                    oprot.writeFieldEnd();
                }

                if (getUpdatedAt().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("updated_at", org.thryft.protocol.TType.STRUCT, (short)-1));
                    oprot.writeDateTime(getUpdatedAt().get());
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldBegin(new org.thryft.protocol.TField("url_key", org.thryft.protocol.TType.STRING, (short)-1));
                oprot.writeString(getUrlKey());
                oprot.writeFieldEnd();

                if (getUrlPath().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("url_path", org.thryft.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getUrlPath().get());
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldBegin(new org.thryft.protocol.TField("visibility", org.thryft.protocol.TType.SET, (short)-1));
                oprot.writeSetBegin(new org.thryft.protocol.TSet(org.thryft.protocol.TType.STRING, getVisibility().size()));
                for (final String _iter0 : getVisibility()) {
                    oprot.writeString(_iter0);
                }
                oprot.writeSetEnd();
                oprot.writeFieldEnd();

                if (getWeight().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("weight", org.thryft.protocol.TType.STRUCT, (short)-1));
                    oprot.writeDecimal(getWeight().get());
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldStop();

                oprot.writeStructEnd();
                break;
        }
    }

    private final com.google.common.base.Optional<String> activationInformation;

    private final com.google.common.base.Optional<Integer> backorders;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProduct>> children;

    private final com.google.common.base.Optional<java.math.BigDecimal> cost;

    private final com.google.common.base.Optional<org.joda.time.DateTime> createdAt;

    private final com.google.common.base.Optional<String> description;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProductImage>> images;

    private final com.google.common.base.Optional<Boolean> isInStock;

    private final com.google.common.base.Optional<Boolean> isQtyDecimal;

    private final com.google.common.base.Optional<Boolean> isRecurring;

    private final com.google.common.base.Optional<org.joda.time.DateTime> lowStockDate;

    private final com.google.common.base.Optional<java.math.BigDecimal> maxSaleQty;

    private final com.google.common.base.Optional<String> metaDescription;

    private final com.google.common.base.Optional<String> metaKeyword;

    private final com.google.common.base.Optional<String> metaTitle;

    private final com.google.common.base.Optional<java.math.BigDecimal> minimalPrice;

    private final com.google.common.base.Optional<java.math.BigDecimal> minQty;

    private final com.google.common.base.Optional<java.math.BigDecimal> minSaleQty;

    private final com.google.common.base.Optional<String> model;

    private final String name;

    private final com.google.common.base.Optional<org.joda.time.DateTime> newsFromDate;

    private final com.google.common.base.Optional<org.joda.time.DateTime> newsToDate;

    private final com.google.common.base.Optional<java.math.BigDecimal> notifyStockQty;

    /**
     * Optional in 1.3
     */
    private final com.google.common.base.Optional<java.math.BigDecimal> price;

    private final com.google.common.base.Optional<java.math.BigDecimal> qty;

    private final com.google.common.base.Optional<String> shippingPolicy;

    private final String shortDescription;

    private final String sku;

    private final com.google.common.base.Optional<org.joda.time.DateTime> specialFromDate;

    private final com.google.common.base.Optional<java.math.BigDecimal> specialPrice;

    private final com.google.common.base.Optional<org.joda.time.DateTime> specialToDate;

    private final String store;

    /**
     * Optional in 1.3
     */
    private final com.google.common.base.Optional<com.yogento.api.models.catalog.product.magento.MagentoProductStatus> status;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> tags;

    /**
     * Optional in 1.3
     */
    private final com.google.common.base.Optional<String> type;

    private final com.google.common.base.Optional<org.joda.time.DateTime> updatedAt;

    private final String urlKey;

    /**
     * Optional in 1.3
     */
    private final com.google.common.base.Optional<String> urlPath;

    /**
     * Formerly an enum; the strings differ between Magento versions
     */
    private final com.google.common.collect.ImmutableSet<String> visibility;

    private final com.google.common.base.Optional<java.math.BigDecimal> weight;
}
