//调试表原始对象
{
        "title":"调试：com.intellij.database.psi.DbTableImpl",
        "methodList":[{
        "name":"getDocumentation",
        "desc":"public java.lang.StringBuilder com.intellij.database.psi.DbTableImpl.getDocumentation()",
        "value":"<html><body><b>Data Source:</b> 10.10.13.76<br><b>Schema:</b> yaocao3<br><b>Table:</b> yc_goods<br><br><font color=\"#808080\">-- 烟草商品表</font><br><code><pre><font color=\"#808080\">-- auto-generated definition</font>\n<font color=\"#cc7832\">create</font> <font color=\"#cc7832\">table</font> yc_goods\n(\n    id              <font color=\"#cc7832\">int</font> <font color=\"#cc7832\">unsigned</font> <font color=\"#cc7832\">auto_increment</font>\n        <font color=\"#cc7832\">primary</font> <font color=\"#cc7832\">key</font><font color=\"#cc7832\">,</font>\n    bar_code        <font color=\"#cc7832\">varchar</font>(<font color=\"#6897bb\">13</font>)                    <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;烟草条码&#39;</font><font color=\"#cc7832\">,</font>\n    goods_name      <font color=\"#cc7832\">varchar</font>(<font color=\"#6897bb\">30</font>)                    <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;品名&#39;</font><font color=\"#cc7832\">,</font>\n    brand           <font color=\"#cc7832\">varchar</font>(<font color=\"#6897bb\">15</font>)                    <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;品牌&#39;</font><font color=\"#cc7832\">,</font>\n    category        <font color=\"#cc7832\">varchar</font>(<font color=\"#6897bb\">15</font>)                    <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;品类&#39;</font><font color=\"#cc7832\">,</font>\n    price           <font color=\"#cc7832\">decimal</font>(<font color=\"#6897bb\">10</font><font color=\"#cc7832\">,</font> <font color=\"#6897bb\">2</font>) <font color=\"#cc7832\">unsigned</font>        <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;零售价(盒包装)&#39;</font><font color=\"#cc7832\">,</font>\n    item_price      <font color=\"#cc7832\">decimal</font>(<font color=\"#6897bb\">10</font><font color=\"#cc7832\">,</font> <font color=\"#6897bb\">2</font>) <font color=\"#cc7832\">unsigned</font>        <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;零售价(条包装)&#39;</font><font color=\"#cc7832\">,</font>\n    origin          <font color=\"#cc7832\">varchar</font>(<font color=\"#6897bb\">30</font>)                    <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;产地&#39;</font><font color=\"#cc7832\">,</font>\n    origin_id       <font color=\"#cc7832\">mediumint</font> <font color=\"#cc7832\">unsigned</font>  <font color=\"#cc7832\">default</font> <font color=\"#6897bb\">0</font>  <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;产地id&#39;</font><font color=\"#cc7832\">,</font>\n    production_year <font color=\"#cc7832\">varchar</font>(<font color=\"#6897bb\">30</font>)         <font color=\"#cc7832\">default</font> <font color=\"#6a8759\">&#39;&#39;</font> <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;生产年份&#39;</font><font color=\"#cc7832\">,</font>\n    goods_type      <font color=\"#cc7832\">varchar</font>(<font color=\"#6897bb\">30</font>)                    <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;香烟类型&#39;</font><font color=\"#cc7832\">,</font>\n    tar             <font color=\"#cc7832\">varchar</font>(<font color=\"#6897bb\">30</font>)                    <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;焦油量&#39;</font><font color=\"#cc7832\">,</font>\n    unit            <font color=\"#cc7832\">varchar</font>(<font color=\"#6897bb\">30</font>)                    <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;计价单位(盒包装)&#39;</font><font color=\"#cc7832\">,</font>\n    period_num      <font color=\"#cc7832\">varchar</font>(<font color=\"#6897bb\">30</font>)                    <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;期数&#39;</font><font color=\"#cc7832\">,</font>\n    price_clerk     <font color=\"#cc7832\">varchar</font>(<font color=\"#6897bb\">30</font>)                    <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;物价员&#39;</font><font color=\"#cc7832\">,</font>\n    item_bar_code   <font color=\"#cc7832\">bigint</font>(<font color=\"#6897bb\">13</font>) <font color=\"#cc7832\">unsigned</font>            <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;商品条码(条包装)&#39;</font><font color=\"#cc7832\">,</font>\n    remark          <font color=\"#cc7832\">varchar</font>(<font color=\"#6897bb\">200</font>)        <font color=\"#cc7832\">default</font> <font color=\"#6a8759\">&#39;&#39;</font> <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;备注&#39;</font><font color=\"#cc7832\">,</font>\n    province_id     <font color=\"#cc7832\">mediumint</font> <font color=\"#cc7832\">unsigned</font>  <font color=\"#cc7832\">default</font> <font color=\"#6897bb\">0</font>  <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;省id&#39;</font><font color=\"#cc7832\">,</font>\n    city_id         <font color=\"#cc7832\">mediumint</font> <font color=\"#cc7832\">unsigned</font>  <font color=\"#cc7832\">default</font> <font color=\"#6897bb\">0</font>  <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;市id&#39;</font><font color=\"#cc7832\">,</font>\n    area_id         <font color=\"#cc7832\">mediumint</font> <font color=\"#cc7832\">unsigned</font>  <font color=\"#cc7832\">default</font> <font color=\"#6897bb\">0</font>  <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39; 区id&#39;</font><font color=\"#cc7832\">,</font>\n    street_id       <font color=\"#cc7832\">mediumint</font> <font color=\"#cc7832\">unsigned</font>  <font color=\"#cc7832\">default</font> <font color=\"#6897bb\">0</font>  <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;街道id&#39;</font><font color=\"#cc7832\">,</font>\n    create_id       <font color=\"#cc7832\">int</font> <font color=\"#cc7832\">unsigned</font>        <font color=\"#cc7832\">default</font> <font color=\"#6897bb\">0</font>  <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;创建者id&#39;</font><font color=\"#cc7832\">,</font>\n    update_id       <font color=\"#cc7832\">int</font> <font color=\"#cc7832\">unsigned</font>        <font color=\"#cc7832\">default</font> <font color=\"#6897bb\">0</font>  <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;更新者id&#39;</font><font color=\"#cc7832\">,</font>\n    create_time     <font color=\"#cc7832\">int</font> <font color=\"#cc7832\">unsigned</font>        <font color=\"#cc7832\">default</font> <font color=\"#6897bb\">0</font>  <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;创建时间&#39;</font><font color=\"#cc7832\">,</font>\n    update_time     <font color=\"#cc7832\">int</font> <font color=\"#cc7832\">unsigned</font>        <font color=\"#cc7832\">default</font> <font color=\"#6897bb\">0</font>  <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;更新时间&#39;</font><font color=\"#cc7832\">,</font>\n    is_delete       <font color=\"#cc7832\">tinyint</font>(<font color=\"#6897bb\">1</font>) <font color=\"#cc7832\">unsigned</font> <font color=\"#cc7832\">default</font> <font color=\"#6897bb\">0</font>  <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;1；已删除；0；未删除；&#39;</font><font color=\"#cc7832\">,</font>\n    item_unit       <font color=\"#cc7832\">varchar</font>(<font color=\"#6897bb\">10</font>)                    <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;计价单位(条包装)&#39;</font><font color=\"#cc7832\">,</font>\n    cat             <font color=\"#cc7832\">varchar</font>(<font color=\"#6897bb\">30</font>)                    <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;类别&#39;</font><font color=\"#cc7832\">,</font>\n    standards       <font color=\"#cc7832\">varchar</font>(<font color=\"#6897bb\">30</font>)                    <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;规格&#39;</font><font color=\"#cc7832\">,</font>\n    cost_price      <font color=\"#cc7832\">decimal</font>(<font color=\"#6897bb\">10</font><font color=\"#cc7832\">,</font> <font color=\"#6897bb\">2</font>) <font color=\"#cc7832\">unsigned</font>        <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;成本价&#39;</font>\n)\n    <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;烟草商品表&#39;</font><font color=\"#cc7832\">;</font>\n\n<font color=\"#cc7832\">create</font> <font color=\"#cc7832\">index</font> bar_code\n    <font color=\"#cc7832\">on</font> yc_goods (bar_code)<font color=\"#cc7832\">;</font>\n\n<font color=\"#cc7832\">create</font> <font color=\"#cc7832\">index</font> brand\n    <font color=\"#cc7832\">on</font> yc_goods (brand)<font color=\"#cc7832\">;</font>\n\n<font color=\"#cc7832\">create</font> <font color=\"#cc7832\">index</font> goods_name\n    <font color=\"#cc7832\">on</font> yc_goods (goods_name)<font color=\"#cc7832\">;</font>\n\n<font color=\"#cc7832\">create</font> <font color=\"#cc7832\">index</font> is_delete\n    <font color=\"#cc7832\">on</font> yc_goods (is_delete)<font color=\"#cc7832\">;</font>\n\n<font color=\"#cc7832\">create</font> <font color=\"#cc7832\">index</font> item_bar_code\n    <font color=\"#cc7832\">on</font> yc_goods (item_bar_code)<font color=\"#cc7832\">;</font>\n\n<font color=\"#cc7832\">create</font> <font color=\"#cc7832\">index</font> origin_id\n    <font color=\"#cc7832\">on</font> yc_goods (origin_id)<font color=\"#cc7832\">;</font>\n\n<font color=\"#cc7832\">create</font> <font color=\"#cc7832\">index</font> price\n    <font color=\"#cc7832\">on</font> yc_goods (price)<font color=\"#cc7832\">;</font>\n\n<font color=\"#cc7832\">create</font> <font color=\"#cc7832\">index</font> province_id\n    <font color=\"#cc7832\">on</font> yc_goods (province_id<font color=\"#cc7832\">,</font> city_id<font color=\"#cc7832\">,</font> area_id<font color=\"#cc7832\">,</font> street_id)<font color=\"#cc7832\">;</font>\n\n<font color=\"#cc7832\">create</font> <font color=\"#cc7832\">index</font> update_time\n    <font color=\"#cc7832\">on</font> yc_goods (update_time)<font color=\"#cc7832\">;</font></pre></code>"
        },{
        "name":"getDocumentation",
        "desc":"public java.lang.CharSequence com.intellij.database.psi.DbTableImpl.getDocumentation()",
        "value":"<html><body><b>Data Source:</b> 10.10.13.76<br><b>Schema:</b> yaocao3<br><b>Table:</b> yc_goods<br><br><font color=\"#808080\">-- 烟草商品表</font><br><code><pre><font color=\"#808080\">-- auto-generated definition</font>\n<font color=\"#cc7832\">create</font> <font color=\"#cc7832\">table</font> yc_goods\n(\n    id              <font color=\"#cc7832\">int</font> <font color=\"#cc7832\">unsigned</font> <font color=\"#cc7832\">auto_increment</font>\n        <font color=\"#cc7832\">primary</font> <font color=\"#cc7832\">key</font><font color=\"#cc7832\">,</font>\n    bar_code        <font color=\"#cc7832\">varchar</font>(<font color=\"#6897bb\">13</font>)                    <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;烟草条码&#39;</font><font color=\"#cc7832\">,</font>\n    goods_name      <font color=\"#cc7832\">varchar</font>(<font color=\"#6897bb\">30</font>)                    <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;品名&#39;</font><font color=\"#cc7832\">,</font>\n    brand           <font color=\"#cc7832\">varchar</font>(<font color=\"#6897bb\">15</font>)                    <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;品牌&#39;</font><font color=\"#cc7832\">,</font>\n    category        <font color=\"#cc7832\">varchar</font>(<font color=\"#6897bb\">15</font>)                    <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;品类&#39;</font><font color=\"#cc7832\">,</font>\n    price           <font color=\"#cc7832\">decimal</font>(<font color=\"#6897bb\">10</font><font color=\"#cc7832\">,</font> <font color=\"#6897bb\">2</font>) <font color=\"#cc7832\">unsigned</font>        <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;零售价(盒包装)&#39;</font><font color=\"#cc7832\">,</font>\n    item_price      <font color=\"#cc7832\">decimal</font>(<font color=\"#6897bb\">10</font><font color=\"#cc7832\">,</font> <font color=\"#6897bb\">2</font>) <font color=\"#cc7832\">unsigned</font>        <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;零售价(条包装)&#39;</font><font color=\"#cc7832\">,</font>\n    origin          <font color=\"#cc7832\">varchar</font>(<font color=\"#6897bb\">30</font>)                    <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;产地&#39;</font><font color=\"#cc7832\">,</font>\n    origin_id       <font color=\"#cc7832\">mediumint</font> <font color=\"#cc7832\">unsigned</font>  <font color=\"#cc7832\">default</font> <font color=\"#6897bb\">0</font>  <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;产地id&#39;</font><font color=\"#cc7832\">,</font>\n    production_year <font color=\"#cc7832\">varchar</font>(<font color=\"#6897bb\">30</font>)         <font color=\"#cc7832\">default</font> <font color=\"#6a8759\">&#39;&#39;</font> <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;生产年份&#39;</font><font color=\"#cc7832\">,</font>\n    goods_type      <font color=\"#cc7832\">varchar</font>(<font color=\"#6897bb\">30</font>)                    <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;香烟类型&#39;</font><font color=\"#cc7832\">,</font>\n    tar             <font color=\"#cc7832\">varchar</font>(<font color=\"#6897bb\">30</font>)                    <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;焦油量&#39;</font><font color=\"#cc7832\">,</font>\n    unit            <font color=\"#cc7832\">varchar</font>(<font color=\"#6897bb\">30</font>)                    <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;计价单位(盒包装)&#39;</font><font color=\"#cc7832\">,</font>\n    period_num      <font color=\"#cc7832\">varchar</font>(<font color=\"#6897bb\">30</font>)                    <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;期数&#39;</font><font color=\"#cc7832\">,</font>\n    price_clerk     <font color=\"#cc7832\">varchar</font>(<font color=\"#6897bb\">30</font>)                    <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;物价员&#39;</font><font color=\"#cc7832\">,</font>\n    item_bar_code   <font color=\"#cc7832\">bigint</font>(<font color=\"#6897bb\">13</font>) <font color=\"#cc7832\">unsigned</font>            <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;商品条码(条包装)&#39;</font><font color=\"#cc7832\">,</font>\n    remark          <font color=\"#cc7832\">varchar</font>(<font color=\"#6897bb\">200</font>)        <font color=\"#cc7832\">default</font> <font color=\"#6a8759\">&#39;&#39;</font> <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;备注&#39;</font><font color=\"#cc7832\">,</font>\n    province_id     <font color=\"#cc7832\">mediumint</font> <font color=\"#cc7832\">unsigned</font>  <font color=\"#cc7832\">default</font> <font color=\"#6897bb\">0</font>  <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;省id&#39;</font><font color=\"#cc7832\">,</font>\n    city_id         <font color=\"#cc7832\">mediumint</font> <font color=\"#cc7832\">unsigned</font>  <font color=\"#cc7832\">default</font> <font color=\"#6897bb\">0</font>  <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;市id&#39;</font><font color=\"#cc7832\">,</font>\n    area_id         <font color=\"#cc7832\">mediumint</font> <font color=\"#cc7832\">unsigned</font>  <font color=\"#cc7832\">default</font> <font color=\"#6897bb\">0</font>  <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39; 区id&#39;</font><font color=\"#cc7832\">,</font>\n    street_id       <font color=\"#cc7832\">mediumint</font> <font color=\"#cc7832\">unsigned</font>  <font color=\"#cc7832\">default</font> <font color=\"#6897bb\">0</font>  <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;街道id&#39;</font><font color=\"#cc7832\">,</font>\n    create_id       <font color=\"#cc7832\">int</font> <font color=\"#cc7832\">unsigned</font>        <font color=\"#cc7832\">default</font> <font color=\"#6897bb\">0</font>  <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;创建者id&#39;</font><font color=\"#cc7832\">,</font>\n    update_id       <font color=\"#cc7832\">int</font> <font color=\"#cc7832\">unsigned</font>        <font color=\"#cc7832\">default</font> <font color=\"#6897bb\">0</font>  <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;更新者id&#39;</font><font color=\"#cc7832\">,</font>\n    create_time     <font color=\"#cc7832\">int</font> <font color=\"#cc7832\">unsigned</font>        <font color=\"#cc7832\">default</font> <font color=\"#6897bb\">0</font>  <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;创建时间&#39;</font><font color=\"#cc7832\">,</font>\n    update_time     <font color=\"#cc7832\">int</font> <font color=\"#cc7832\">unsigned</font>        <font color=\"#cc7832\">default</font> <font color=\"#6897bb\">0</font>  <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;更新时间&#39;</font><font color=\"#cc7832\">,</font>\n    is_delete       <font color=\"#cc7832\">tinyint</font>(<font color=\"#6897bb\">1</font>) <font color=\"#cc7832\">unsigned</font> <font color=\"#cc7832\">default</font> <font color=\"#6897bb\">0</font>  <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;1；已删除；0；未删除；&#39;</font><font color=\"#cc7832\">,</font>\n    item_unit       <font color=\"#cc7832\">varchar</font>(<font color=\"#6897bb\">10</font>)                    <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;计价单位(条包装)&#39;</font><font color=\"#cc7832\">,</font>\n    cat             <font color=\"#cc7832\">varchar</font>(<font color=\"#6897bb\">30</font>)                    <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;类别&#39;</font><font color=\"#cc7832\">,</font>\n    standards       <font color=\"#cc7832\">varchar</font>(<font color=\"#6897bb\">30</font>)                    <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;规格&#39;</font><font color=\"#cc7832\">,</font>\n    cost_price      <font color=\"#cc7832\">decimal</font>(<font color=\"#6897bb\">10</font><font color=\"#cc7832\">,</font> <font color=\"#6897bb\">2</font>) <font color=\"#cc7832\">unsigned</font>        <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;成本价&#39;</font>\n)\n    <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;烟草商品表&#39;</font><font color=\"#cc7832\">;</font>\n\n<font color=\"#cc7832\">create</font> <font color=\"#cc7832\">index</font> bar_code\n    <font color=\"#cc7832\">on</font> yc_goods (bar_code)<font color=\"#cc7832\">;</font>\n\n<font color=\"#cc7832\">create</font> <font color=\"#cc7832\">index</font> brand\n    <font color=\"#cc7832\">on</font> yc_goods (brand)<font color=\"#cc7832\">;</font>\n\n<font color=\"#cc7832\">create</font> <font color=\"#cc7832\">index</font> goods_name\n    <font color=\"#cc7832\">on</font> yc_goods (goods_name)<font color=\"#cc7832\">;</font>\n\n<font color=\"#cc7832\">create</font> <font color=\"#cc7832\">index</font> is_delete\n    <font color=\"#cc7832\">on</font> yc_goods (is_delete)<font color=\"#cc7832\">;</font>\n\n<font color=\"#cc7832\">create</font> <font color=\"#cc7832\">index</font> item_bar_code\n    <font color=\"#cc7832\">on</font> yc_goods (item_bar_code)<font color=\"#cc7832\">;</font>\n\n<font color=\"#cc7832\">create</font> <font color=\"#cc7832\">index</font> origin_id\n    <font color=\"#cc7832\">on</font> yc_goods (origin_id)<font color=\"#cc7832\">;</font>\n\n<font color=\"#cc7832\">create</font> <font color=\"#cc7832\">index</font> price\n    <font color=\"#cc7832\">on</font> yc_goods (price)<font color=\"#cc7832\">;</font>\n\n<font color=\"#cc7832\">create</font> <font color=\"#cc7832\">index</font> province_id\n    <font color=\"#cc7832\">on</font> yc_goods (province_id<font color=\"#cc7832\">,</font> city_id<font color=\"#cc7832\">,</font> area_id<font color=\"#cc7832\">,</font> street_id)<font color=\"#cc7832\">;</font>\n\n<font color=\"#cc7832\">create</font> <font color=\"#cc7832\">index</font> update_time\n    <font color=\"#cc7832\">on</font> yc_goods (update_time)<font color=\"#cc7832\">;</font></pre></code>"
        },{
        "name":"getColumnAttrs",
        "desc":"public java.util.Set<com.intellij.database.model.DasColumn$Attribute> com.intellij.database.psi.DbTableImpl.getColumnAttrs(com.intellij.database.model.DasColumn)",
        "value":null
        },{
        "name":"isSystem",
        "desc":"public boolean com.intellij.database.psi.DbTableImpl.isSystem()",
        "value":"false"
        },{
        "name":"isTemporary",
        "desc":"public boolean com.intellij.database.psi.DbTableImpl.isTemporary()",
        "value":"false"
        },{
        "name":"getName",
        "desc":"public java.lang.String com.intellij.database.psi.DbElementImpl.getName()",
        "value":"yc_goods"
        },{
        "name":"getName",
        "desc":"public java.lang.String com.intellij.database.psi.DbElementImpl.getName(com.intellij.psi.PsiElement)",
        "value":null
        },{
        "name":"getTypeName",
        "desc":"public java.lang.String com.intellij.database.psi.DbElementImpl.getTypeName()",
        "value":"table"
        },{
        "name":"getParent",
        "desc":"public com.intellij.psi.PsiFileSystemItem com.intellij.database.psi.DbElementImpl.getParent()",
        "value":"schema:yaocao3"
        },{
        "name":"getParent",
        "desc":"public com.intellij.database.psi.DbElement com.intellij.database.psi.DbElementImpl.getParent()",
        "value":"schema:yaocao3"
        },{
        "name":"getParent",
        "desc":"public com.intellij.psi.PsiElement com.intellij.database.psi.DbElementImpl.getParent()",
        "value":"schema:yaocao3"
        },{
        "name":"init",
        "desc":"public void com.intellij.database.psi.DbElementImpl.init(com.intellij.psi.PsiElement)",
        "value":null
        },{
        "name":"setName",
        "desc":"public com.intellij.psi.PsiElement com.intellij.database.psi.DbElementImpl.setName(java.lang.String) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"getLanguage",
        "desc":"public com.intellij.lang.Language com.intellij.database.psi.DbElementImpl.getLanguage()",
        "value":"Language: SQL"
        },{
        "name":"getDelegate",
        "desc":"public D com.intellij.database.psi.DbElementImpl.getDelegate()",
        "value":"yc_goods: table"
        },{
        "name":"getVirtualFile",
        "desc":"public com.intellij.openapi.vfs.VirtualFile com.intellij.database.psi.DbElementImpl.getVirtualFile()",
        "value":"DB VirtualFile: table, yaocao3.yc_goods [10.10.13.76] (Valid)"
        },{
        "name":"isCaseSensitive",
        "desc":"public boolean com.intellij.database.psi.DbElementImpl.isCaseSensitive()",
        "value":"true"
        },{
        "name":"getMetaData",
        "desc":"public com.intellij.psi.meta.PsiMetaData com.intellij.database.psi.DbElementImpl.getMetaData()",
        "value":"table:yc_goods"
        },{
        "name":"acceptChildren",
        "desc":"public void com.intellij.database.psi.DbElementImpl.acceptChildren(com.intellij.psi.PsiElementVisitor)",
        "value":null
        },{
        "name":"processDeclarations",
        "desc":"public final boolean com.intellij.database.psi.DbElementImpl.processDeclarations(com.intellij.psi.scope.PsiScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement)",
        "value":null
        },{
        "name":"getBaseIcon",
        "desc":"public javax.swing.Icon com.intellij.database.psi.DbElementImpl.getBaseIcon()",
        "value":"jar:file:/Applications/IntelliJ%20IDEA.app/Contents/plugins/DatabaseTools/lib/database-openapi.jar!/icons/table.svg"
        },{
        "name":"getDasParent",
        "desc":"public P com.intellij.database.psi.DbElementImpl.getDasParent()",
        "value":"schema:yaocao3"
        },{
        "name":"getDasParent",
        "desc":"public com.intellij.database.model.DasObject com.intellij.database.psi.DbElementImpl.getDasParent()",
        "value":"schema:yaocao3"
        },{
        "name":"getDataSource",
        "desc":"public com.intellij.database.psi.DbDataSource com.intellij.database.psi.DbElementImpl.getDataSource()",
        "value":"root:10.10.13.76"
        },{
        "name":"getDataSource",
        "desc":"public com.intellij.database.psi.DbDataSourceImpl com.intellij.database.psi.DbElementImpl.getDataSource()",
        "value":"root:10.10.13.76"
        },{
        "name":"getDasChildren",
        "desc":"public com.intellij.util.containers.JBIterable<com.intellij.database.psi.DbElement> com.intellij.database.psi.DbElementImpl.getDasChildren(com.intellij.database.model.ObjectKind)",
        "value":null
        },{
        "name":"newDeclarationProcessor",
        "desc":"public static com.intellij.util.Processor<com.intellij.database.psi.DbElement> com.intellij.database.psi.DbElementImpl.newDeclarationProcessor(com.intellij.psi.scope.PsiScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement)",
        "value":null
        },{
        "name":"createDeclarationProcessor",
        "desc":"public com.intellij.util.Processor<com.intellij.database.psi.DbElement> com.intellij.database.psi.DbElementImpl.createDeclarationProcessor(com.intellij.psi.scope.PsiScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement)",
        "value":null
        },{
        "name":"getText",
        "desc":"public java.lang.String com.intellij.database.psi.DbElementImpl.getText()",
        "value":"create table yc_goods\n(\n    id              int unsigned auto_increment\n        primary key,\n    bar_code        varchar(13)                    not null comment '烟草条码',\n    goods_name      varchar(30)                    not null comment '品名',\n    brand           varchar(15)                    null comment '品牌',\n    category        varchar(15)                    null comment '品类',\n    price           decimal(10, 2) unsigned        null comment '零售价(盒包装)',\n    item_price      decimal(10, 2) unsigned        null comment '零售价(条包装)',\n    origin          varchar(30)                    null comment '产地',\n    origin_id       mediumint unsigned  default 0  not null comment '产地id',\n    production_year varchar(30)         default '' not null comment '生产年份',\n    goods_type      varchar(30)                    null comment '香烟类型',\n    tar             varchar(30)                    null comment '焦油量',\n    unit            varchar(30)                    null comment '计价单位(盒包装)',\n    period_num      varchar(30)                    null comment '期数',\n    price_clerk     varchar(30)                    null comment '物价员',\n    item_bar_code   bigint(13) unsigned            null comment '商品条码(条包装)',\n    remark          varchar(200)        default '' not null comment '备注',\n    province_id     mediumint unsigned  default 0  not null comment '省id',\n    city_id         mediumint unsigned  default 0  not null comment '市id',\n    area_id         mediumint unsigned  default 0  not null comment ' 区id',\n    street_id       mediumint unsigned  default 0  not null comment '街道id',\n    create_id       int unsigned        default 0  not null comment '创建者id',\n    update_id       int unsigned        default 0  not null comment '更新者id',\n    create_time     int unsigned        default 0  not null comment '创建时间',\n    update_time     int unsigned        default 0  not null comment '更新时间',\n    is_delete       tinyint(1) unsigned default 0  not null comment '1；已删除；0；未删除；',\n    item_unit       varchar(10)                    null comment '计价单位(条包装)',\n    cat             varchar(30)                    null comment '类别',\n    standards       varchar(30)                    null comment '规格',\n    cost_price      decimal(10, 2) unsigned        null comment '成本价'\n)\n    comment '烟草商品表';\n\ncreate index bar_code\n    on yc_goods (bar_code);\n\ncreate index brand\n    on yc_goods (brand);\n\ncreate index goods_name\n    on yc_goods (goods_name);\n\ncreate index is_delete\n    on yc_goods (is_delete);\n\ncreate index item_bar_code\n    on yc_goods (item_bar_code);\n\ncreate index origin_id\n    on yc_goods (origin_id);\n\ncreate index price\n    on yc_goods (price);\n\ncreate index province_id\n    on yc_goods (province_id, city_id, area_id, street_id);\n\ncreate index update_time\n    on yc_goods (update_time);\n\n"
        },{
        "name":"getProject",
        "desc":"public com.intellij.openapi.project.Project com.intellij.database.psi.DbElementImpl.getProject()",
        "value":"Project (name=springboottest, containerState=ACTIVE, componentStore=/Users/bear/IdeaProjects/springboottest) "
        },{
        "name":"getKind",
        "desc":"public com.intellij.database.model.ObjectKind com.intellij.database.psi.DbElementImpl.getKind()",
        "value":"table"
        },{
        "name":"navigate",
        "desc":"public void com.intellij.database.psi.DbElementImpl.navigate(boolean,java.lang.String[],com.intellij.database.util.DbImplUtil$TriConsumer<com.intellij.database.util.DdlBuilder, java.util.List<com.intellij.database.model.DasColumn>, com.intellij.database.Dbms>)",
        "value":null
        },{
        "name":"navigate",
        "desc":"public void com.intellij.database.psi.DbElementImpl.navigate(boolean)",
        "value":null
        },{
        "name":"navigate",
        "desc":"public void com.intellij.database.psi.DbElementImpl.navigate(boolean,java.lang.String[],boolean,com.intellij.database.util.DbImplUtil$TriConsumer<com.intellij.database.util.DdlBuilder, java.util.List<com.intellij.database.model.DasColumn>, com.intellij.database.Dbms>)",
        "value":null
        },{
        "name":"processChildren",
        "desc":"public boolean com.intellij.database.psi.DbElementImpl.processChildren(com.intellij.psi.search.PsiElementProcessor<com.intellij.psi.PsiFileSystemItem>)",
        "value":null
        },{
        "name":"checkSetName",
        "desc":"public void com.intellij.database.psi.DbElementImpl.checkSetName(java.lang.String) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"canNavigate",
        "desc":"public boolean com.intellij.database.psi.DbElementImpl.canNavigate()",
        "value":null
        },{
        "name":"canNavigateToSource",
        "desc":"public boolean com.intellij.database.psi.DbElementImpl.canNavigateToSource()",
        "value":null
        },{
        "name":"getLocationString",
        "desc":"public java.lang.String com.intellij.database.psi.DbElementImpl.getLocationString()",
        "value":"yaocao3 [10.10.13.76]"
        },{
        "name":"isValid",
        "desc":"public boolean com.intellij.database.psi.DbElementImpl.isValid()",
        "value":"true"
        },{
        "name":"getManager",
        "desc":"public com.intellij.psi.PsiManager com.intellij.database.psi.DbElementImpl.getManager()",
        "value":"com.intellij.psi.impl.PsiManagerImpl@4f0b88ec"
        },{
        "name":"getIcon",
        "desc":"public javax.swing.Icon com.intellij.database.psi.DbElementImpl.getIcon()",
        "value":"Deferred. Base=Row icon. myIcons=[jar:file:/Applications/IntelliJ%20IDEA.app/Contents/plugins/DatabaseTools/lib/database-openapi.jar!/icons/table.svg, null]"
        },{
        "name":"getIcon",
        "desc":"public javax.swing.Icon com.intellij.database.psi.DbElementImpl.getIcon(boolean)",
        "value":null
        },{
        "name":"getWeight",
        "desc":"public int com.intellij.database.psi.DbElementImpl.getWeight()",
        "value":"10000"
        },{
        "name":"getComment",
        "desc":"public java.lang.String com.intellij.database.psi.DbElementImpl.getComment()",
        "value":"烟草商品表"
        },{
        "name":"getPosition",
        "desc":"public short com.intellij.database.psi.DbElementImpl.getPosition()",
        "value":"0"
        },{
        "name":"getChildren",
        "desc":"public com.intellij.psi.PsiElement[] com.intellij.database.psi.DbElementImpl.getChildren()",
        "value":"[Lcom.intellij.psi.PsiElement;@2246fedf"
        },{
        "name":"isDirectory",
        "desc":"public boolean com.intellij.database.psi.DbElementImpl.isDirectory()",
        "value":"false"
        },{
        "name":"isWritable",
        "desc":"public boolean com.intellij.database.psi.DbElementImpl.isWritable()",
        "value":"true"
        },{
        "name":"getDeclaration",
        "desc":"public com.intellij.psi.PsiElement com.intellij.database.psi.DbElementImpl.getDeclaration()",
        "value":"table:yc_goods"
        },{
        "name":"getNode",
        "desc":"public com.intellij.lang.ASTNode com.intellij.psi.impl.FakePsiElement.getNode()",
        "value":null
        },{
        "name":"isPhysical",
        "desc":"public boolean com.intellij.psi.impl.FakePsiElement.isPhysical()",
        "value":"false"
        },{
        "name":"getNextSibling",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getNextSibling()",
        "value":null
        },{
        "name":"getFirstChild",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getFirstChild()",
        "value":null
        },{
        "name":"getLastChild",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getLastChild()",
        "value":null
        },{
        "name":"getPrevSibling",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getPrevSibling()",
        "value":null
        },{
        "name":"getTextRange",
        "desc":"public com.intellij.openapi.util.TextRange com.intellij.psi.impl.FakePsiElement.getTextRange()",
        "value":null
        },{
        "name":"getStartOffsetInParent",
        "desc":"public int com.intellij.psi.impl.FakePsiElement.getStartOffsetInParent()",
        "value":"0"
        },{
        "name":"findElementAt",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.findElementAt(int)",
        "value":null
        },{
        "name":"getTextOffset",
        "desc":"public int com.intellij.psi.impl.FakePsiElement.getTextOffset()",
        "value":"0"
        },{
        "name":"textToCharArray",
        "desc":"public char[] com.intellij.psi.impl.FakePsiElement.textToCharArray()",
        "value":null
        },{
        "name":"textContains",
        "desc":"public boolean com.intellij.psi.impl.FakePsiElement.textContains(char)",
        "value":null
        },{
        "name":"getPresentableText",
        "desc":"public java.lang.String com.intellij.psi.impl.FakePsiElement.getPresentableText()",
        "value":"yc_goods"
        },{
        "name":"getPresentation",
        "desc":"public com.intellij.navigation.ItemPresentation com.intellij.psi.impl.FakePsiElement.getPresentation()",
        "value":"table:yc_goods"
        },{
        "name":"getIcon",
        "desc":"public final javax.swing.Icon com.intellij.psi.impl.FakePsiElement.getIcon(int)",
        "value":null
        },{
        "name":"getTextLength",
        "desc":"public int com.intellij.psi.impl.FakePsiElement.getTextLength()",
        "value":"0"
        },{
        "name":"add",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.add(com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"replace",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.replace(com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"checkDelete",
        "desc":"public void com.intellij.psi.impl.PsiElementBase.checkDelete() throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"delete",
        "desc":"public void com.intellij.psi.impl.PsiElementBase.delete() throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"accept",
        "desc":"public void com.intellij.psi.impl.PsiElementBase.accept(com.intellij.psi.PsiElementVisitor)",
        "value":null
        },{
        "name":"getContext",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.getContext()",
        "value":"schema:yaocao3"
        },{
        "name":"copy",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.copy()",
        "value":null
        },{
        "name":"addBefore",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addBefore(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"addAfter",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addAfter(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"checkAdd",
        "desc":"public void com.intellij.psi.impl.PsiElementBase.checkAdd(com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"getContainingFile",
        "desc":"public com.intellij.psi.PsiFile com.intellij.psi.impl.PsiElementBase.getContainingFile()",
        "value":null
        },{
        "name":"findReferenceAt",
        "desc":"public com.intellij.psi.PsiReference com.intellij.psi.impl.PsiElementBase.findReferenceAt(int)",
        "value":null
        },{
        "name":"getNavigationElement",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.getNavigationElement()",
        "value":"table:yc_goods"
        },{
        "name":"getOriginalElement",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.getOriginalElement()",
        "value":"table:yc_goods"
        },{
        "name":"textMatches",
        "desc":"public boolean com.intellij.psi.impl.PsiElementBase.textMatches(java.lang.CharSequence)",
        "value":null
        },{
        "name":"textMatches",
        "desc":"public boolean com.intellij.psi.impl.PsiElementBase.textMatches(com.intellij.psi.PsiElement)",
        "value":null
        },{
        "name":"addRangeBefore",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addRangeBefore(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"addRangeAfter",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addRangeAfter(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"deleteChildRange",
        "desc":"public void com.intellij.psi.impl.PsiElementBase.deleteChildRange(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"getReference",
        "desc":"public com.intellij.psi.PsiReference com.intellij.psi.impl.PsiElementBase.getReference()",
        "value":null
        },{
        "name":"getReferences",
        "desc":"public com.intellij.psi.PsiReference[] com.intellij.psi.impl.PsiElementBase.getReferences()",
        "value":"[Lcom.intellij.psi.PsiReference;@3b2520da"
        },{
        "name":"getResolveScope",
        "desc":"public com.intellij.psi.search.GlobalSearchScope com.intellij.psi.impl.PsiElementBase.getResolveScope()",
        "value":"Project and Libraries"
        },{
        "name":"getUseScope",
        "desc":"public com.intellij.psi.search.SearchScope com.intellij.psi.impl.PsiElementBase.getUseScope()",
        "value":"Project and Libraries"
        },{
        "name":"isEquivalentTo",
        "desc":"public boolean com.intellij.psi.impl.PsiElementBase.isEquivalentTo(com.intellij.psi.PsiElement)",
        "value":null
        },{
        "name":"addRange",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addRange(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"createLayeredIcon",
        "desc":"public static com.intellij.ui.RowIcon com.intellij.psi.impl.ElementBase.createLayeredIcon(com.intellij.openapi.util.Iconable,javax.swing.Icon,int)",
        "value":null
        },{
        "name":"registerIconLayer",
        "desc":"public static void com.intellij.psi.impl.ElementBase.registerIconLayer(int,javax.swing.Icon)",
        "value":null
        },{
        "name":"isNativeFileType",
        "desc":"public static boolean com.intellij.psi.impl.ElementBase.isNativeFileType(com.intellij.openapi.fileTypes.FileType)",
        "value":null
        },{
        "name":"overlayIcons",
        "desc":"public static javax.swing.Icon com.intellij.psi.impl.ElementBase.overlayIcons(javax.swing.Icon...)",
        "value":null
        },{
        "name":"buildRowIcon",
        "desc":"public static com.intellij.ui.icons.RowIcon com.intellij.psi.impl.ElementBase.buildRowIcon(javax.swing.Icon,javax.swing.Icon)",
        "value":null
        },{
        "name":"iconWithVisibilityIfNeeded",
        "desc":"public static javax.swing.Icon com.intellij.psi.impl.ElementBase.iconWithVisibilityIfNeeded(int,javax.swing.Icon,javax.swing.Icon)",
        "value":null
        },{
        "name":"transformFlags",
        "desc":"public static int com.intellij.psi.impl.ElementBase.transformFlags(com.intellij.psi.PsiElement,int)",
        "value":null
        },{
        "name":"replace",
        "desc":"public <T> boolean com.intellij.openapi.util.UserDataHolderBase.replace(com.intellij.openapi.util.Key<T>,T,T)",
        "value":null
        },{
        "name":"getUserDataString",
        "desc":"public java.lang.String com.intellij.openapi.util.UserDataHolderBase.getUserDataString()",
        "value":"{COLOR_KEY=com.intellij.database.view.DatabaseColorManager$CachedColor@12698881, lastComputedIcon={0=Row icon. myIcons=[jar:file:/Applications/IntelliJ%20IDEA.app/Contents/plugins/DatabaseTools/lib/database-openapi.jar!/icons/table.svg, null]}, CACHED_SMART_POINTER_KEY=com.intellij.reference.SoftReference@1363ec8}"
        },{
        "name":"copyUserDataTo",
        "desc":"public void com.intellij.openapi.util.UserDataHolderBase.copyUserDataTo(com.intellij.openapi.util.UserDataHolderBase)",
        "value":null
        },{
        "name":"getCopyableUserData",
        "desc":"public <T> T com.intellij.openapi.util.UserDataHolderBase.getCopyableUserData(com.intellij.openapi.util.Key<T>)",
        "value":null
        },{
        "name":"putCopyableUserData",
        "desc":"public <T> void com.intellij.openapi.util.UserDataHolderBase.putCopyableUserData(com.intellij.openapi.util.Key<T>,T)",
        "value":null
        },{
        "name":"putUserDataIfAbsent",
        "desc":"public <T> T com.intellij.openapi.util.UserDataHolderBase.putUserDataIfAbsent(com.intellij.openapi.util.Key<T>,T)",
        "value":null
        },{
        "name":"copyCopyableDataTo",
        "desc":"public void com.intellij.openapi.util.UserDataHolderBase.copyCopyableDataTo(com.intellij.openapi.util.UserDataHolderBase)",
        "value":null
        },{
        "name":"isUserDataEmpty",
        "desc":"public boolean com.intellij.openapi.util.UserDataHolderBase.isUserDataEmpty()",
        "value":"false"
        },{
        "name":"putUserData",
        "desc":"public <T> void com.intellij.openapi.util.UserDataHolderBase.putUserData(com.intellij.openapi.util.Key<T>,T)",
        "value":null
        },{
        "name":"getUserData",
        "desc":"public <T> T com.intellij.openapi.util.UserDataHolderBase.getUserData(com.intellij.openapi.util.Key<T>)",
        "value":null
        },{
        "name":"getTextRangeInParent",
        "desc":"public default com.intellij.openapi.util.TextRange com.intellij.psi.PsiElement.getTextRangeInParent()",
        "value":"(0,0)"
        },{
        "name":"getDbParent",
        "desc":"public default com.intellij.database.model.DasObject com.intellij.database.model.DasObject.getDbParent()",
        "value":"schema:yaocao3"
        },{
        "name":"getDbChildren",
        "desc":"public default <C> com.intellij.util.containers.JBIterable<C> com.intellij.database.model.DasObject.getDbChildren(java.lang.Class<C>,com.intellij.database.model.ObjectKind)",
        "value":null
        },{
        "name":"getDependencies",
        "desc":"public default java.lang.Object[] com.intellij.psi.meta.PsiMetaData.getDependencies()",
        "value":"[Ljava.lang.Object;@14939837"
        },{
        "name":"getDependences",
        "desc":"public default java.lang.Object[] com.intellij.psi.meta.PsiMetaData.getDependences()",
        "value":"[Ljava.lang.Object;@14939837"
        }],
        "----":"-----------------我是一条华丽的分割线-----------------",
        "fieldList":[{
        "name":"LOG",
        "type":"com.intellij.openapi.diagnostic.Logger",
        "value":"com.intellij.idea.IdeaLogger@7481ed54"
        },{
        "name":"WEIGHT_BASE",
        "type":"int",
        "value":"10000"
        },{
        "name":"WEIGHT_INC",
        "type":"int",
        "value":"1000"
        },{
        "name":"myParent",
        "type":"com.intellij.database.psi.DbElement",
        "value":"schema:yaocao3"
        },{
        "name":"myDelegate",
        "type":"java.lang.Object",
        "value":"yc_goods: table"
        },{
        "name":"myTransactionalVersion",
        "type":"long",
        "value":"3"
        },{
        "name":"ASYNC_DOC_CUT",
        "type":"java.lang.String",
        "value":"<!-- async-doc-cut -->"
        },{
        "name":"LOG",
        "type":"com.intellij.openapi.diagnostic.Logger",
        "value":"com.intellij.idea.IdeaLogger@23a5242a"
        },{
        "name":"LOG",
        "type":"com.intellij.openapi.diagnostic.Logger",
        "value":"com.intellij.idea.IdeaLogger@41e9ffd9"
        },{
        "name":"FLAGS_LOCKED",
        "type":"int",
        "value":"2048"
        },{
        "name":"ICON_COMPUTE",
        "type":"java.util.function.Function",
        "value":"com.intellij.psi.impl.ElementBase$$Lambda$1529/0x00000008010ec840@785ced87"
        },{
        "name":"VISIBILITY_ICON_PLACEHOLDER",
        "type":"com.intellij.openapi.util.NotNullLazyValue",
        "value":"com.intellij.psi.impl.ElementBase$1@34c4495"
        },{
        "name":"ICON_PLACEHOLDER",
        "type":"com.intellij.openapi.util.NotNullLazyValue",
        "value":"com.intellij.psi.impl.ElementBase$2@942a4a2"
        },{
        "name":"COPYABLE_USER_MAP_KEY",
        "type":"com.intellij.openapi.util.Key",
        "value":"COPYABLE_USER_MAP_KEY"
        },{
        "name":"myUserMap",
        "type":"com.intellij.util.keyFMap.KeyFMap",
        "value":"{COLOR_KEY=com.intellij.database.view.DatabaseColorManager$CachedColor@12698881, lastComputedIcon={0=Row icon. myIcons=[jar:file:/Applications/IntelliJ%20IDEA.app/Contents/plugins/DatabaseTools/lib/database-openapi.jar!/icons/table.svg, null]}, CACHED_SMART_POINTER_KEY=com.intellij.reference.SoftReference@1363ec8}"
        },{
        "name":"updater",
        "type":"com.intellij.util.concurrency.AtomicFieldUpdater",
        "value":"com.intellij.util.concurrency.AtomicFieldUpdater@75b8564"
        }]
        }

//调试列原始对象
        {
        "title":"调试：com.intellij.database.psi.DbColumnImpl",
        "methodList":[{
        "name":"getDefault",
        "desc":"public java.lang.String com.intellij.database.psi.DbColumnImpl.getDefault()",
        "value":null
        },{
        "name":"getParent",
        "desc":"public com.intellij.psi.PsiElement com.intellij.database.psi.DbColumnImpl.getParent()",
        "value":"table:yc_goods"
        },{
        "name":"getParent",
        "desc":"public com.intellij.database.psi.DbElement com.intellij.database.psi.DbColumnImpl.getParent()",
        "value":"table:yc_goods"
        },{
        "name":"getParent",
        "desc":"public com.intellij.database.psi.DbTable com.intellij.database.psi.DbColumnImpl.getParent()",
        "value":"table:yc_goods"
        },{
        "name":"getParent",
        "desc":"public com.intellij.psi.PsiFileSystemItem com.intellij.database.psi.DbColumnImpl.getParent()",
        "value":"table:yc_goods"
        },{
        "name":"isNotNull",
        "desc":"public boolean com.intellij.database.psi.DbColumnImpl.isNotNull()",
        "value":"true"
        },{
        "name":"getDocumentation",
        "desc":"public java.lang.StringBuilder com.intellij.database.psi.DbColumnImpl.getDocumentation()",
        "value":"<html><body><b>Data Source:</b> 10.10.13.76<br><b>Schema:</b> yaocao3<br><b>Table:</b> yc_goods<br><b>Column:</b> id<br><br><code><pre><font color=\"#cc7832\">alter</font> <font color=\"#cc7832\">table</font> yc_goods\n    <font color=\"#cc7832\">add</font> id <font color=\"#cc7832\">int</font> <font color=\"#cc7832\">unsigned</font> <font color=\"#cc7832\">auto_increment</font><font color=\"#cc7832\">;</font>\n\n</pre></code>"
        },{
        "name":"getDocumentation",
        "desc":"public java.lang.CharSequence com.intellij.database.psi.DbColumnImpl.getDocumentation()",
        "value":"<html><body><b>Data Source:</b> 10.10.13.76<br><b>Schema:</b> yaocao3<br><b>Table:</b> yc_goods<br><b>Column:</b> id<br><br><code><pre><font color=\"#cc7832\">alter</font> <font color=\"#cc7832\">table</font> yc_goods\n    <font color=\"#cc7832\">add</font> id <font color=\"#cc7832\">int</font> <font color=\"#cc7832\">unsigned</font> <font color=\"#cc7832\">auto_increment</font><font color=\"#cc7832\">;</font>\n\n</pre></code>"
        },{
        "name":"getWeight",
        "desc":"public int com.intellij.database.psi.DbColumnImpl.getWeight()",
        "value":"10030"
        },{
        "name":"getDataType",
        "desc":"public com.intellij.database.model.DataType com.intellij.database.psi.DbColumnImpl.getDataType()",
        "value":"int(10) unsigned"
        },{
        "name":"getTable",
        "desc":"public com.intellij.database.model.DasTable com.intellij.database.psi.DbColumnImpl.getTable()",
        "value":"table:yc_goods"
        },{
        "name":"getTable",
        "desc":"public com.intellij.database.psi.DbTable com.intellij.database.psi.DbColumnImpl.getTable()",
        "value":"table:yc_goods"
        },{
        "name":"getName",
        "desc":"public java.lang.String com.intellij.database.psi.DbElementImpl.getName()",
        "value":"id"
        },{
        "name":"getName",
        "desc":"public java.lang.String com.intellij.database.psi.DbElementImpl.getName(com.intellij.psi.PsiElement)",
        "value":null
        },{
        "name":"getTypeName",
        "desc":"public java.lang.String com.intellij.database.psi.DbElementImpl.getTypeName()",
        "value":"column"
        },{
        "name":"init",
        "desc":"public void com.intellij.database.psi.DbElementImpl.init(com.intellij.psi.PsiElement)",
        "value":null
        },{
        "name":"setName",
        "desc":"public com.intellij.psi.PsiElement com.intellij.database.psi.DbElementImpl.setName(java.lang.String) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"getLanguage",
        "desc":"public com.intellij.lang.Language com.intellij.database.psi.DbElementImpl.getLanguage()",
        "value":"Language: SQL"
        },{
        "name":"getDelegate",
        "desc":"public D com.intellij.database.psi.DbElementImpl.getDelegate()",
        "value":"id: column"
        },{
        "name":"getVirtualFile",
        "desc":"public com.intellij.openapi.vfs.VirtualFile com.intellij.database.psi.DbElementImpl.getVirtualFile()",
        "value":"DB VirtualFile: column, yaocao3.yc_goods.id [10.10.13.76] (Valid)"
        },{
        "name":"isCaseSensitive",
        "desc":"public boolean com.intellij.database.psi.DbElementImpl.isCaseSensitive()",
        "value":"false"
        },{
        "name":"getMetaData",
        "desc":"public com.intellij.psi.meta.PsiMetaData com.intellij.database.psi.DbElementImpl.getMetaData()",
        "value":"column:id"
        },{
        "name":"acceptChildren",
        "desc":"public void com.intellij.database.psi.DbElementImpl.acceptChildren(com.intellij.psi.PsiElementVisitor)",
        "value":null
        },{
        "name":"processDeclarations",
        "desc":"public final boolean com.intellij.database.psi.DbElementImpl.processDeclarations(com.intellij.psi.scope.PsiScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement)",
        "value":null
        },{
        "name":"getBaseIcon",
        "desc":"public javax.swing.Icon com.intellij.database.psi.DbElementImpl.getBaseIcon()",
        "value":"jar:file:/Applications/IntelliJ%20IDEA.app/Contents/plugins/DatabaseTools/lib/database-openapi.jar!/icons/col.svg"
        },{
        "name":"getDasParent",
        "desc":"public P com.intellij.database.psi.DbElementImpl.getDasParent()",
        "value":"table:yc_goods"
        },{
        "name":"getDasParent",
        "desc":"public com.intellij.database.model.DasObject com.intellij.database.psi.DbElementImpl.getDasParent()",
        "value":"table:yc_goods"
        },{
        "name":"getDataSource",
        "desc":"public com.intellij.database.psi.DbDataSource com.intellij.database.psi.DbElementImpl.getDataSource()",
        "value":"root:10.10.13.76"
        },{
        "name":"getDataSource",
        "desc":"public com.intellij.database.psi.DbDataSourceImpl com.intellij.database.psi.DbElementImpl.getDataSource()",
        "value":"root:10.10.13.76"
        },{
        "name":"getDasChildren",
        "desc":"public com.intellij.util.containers.JBIterable<com.intellij.database.psi.DbElement> com.intellij.database.psi.DbElementImpl.getDasChildren(com.intellij.database.model.ObjectKind)",
        "value":null
        },{
        "name":"newDeclarationProcessor",
        "desc":"public static com.intellij.util.Processor<com.intellij.database.psi.DbElement> com.intellij.database.psi.DbElementImpl.newDeclarationProcessor(com.intellij.psi.scope.PsiScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement)",
        "value":null
        },{
        "name":"createDeclarationProcessor",
        "desc":"public com.intellij.util.Processor<com.intellij.database.psi.DbElement> com.intellij.database.psi.DbElementImpl.createDeclarationProcessor(com.intellij.psi.scope.PsiScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement)",
        "value":null
        },{
        "name":"getText",
        "desc":"public java.lang.String com.intellij.database.psi.DbElementImpl.getText()",
        "value":"alter table yc_goods\n    add id int unsigned auto_increment;\n\n"
        },{
        "name":"getProject",
        "desc":"public com.intellij.openapi.project.Project com.intellij.database.psi.DbElementImpl.getProject()",
        "value":"Project (name=springboottest, containerState=ACTIVE, componentStore=/Users/bear/IdeaProjects/springboottest) "
        },{
        "name":"getKind",
        "desc":"public com.intellij.database.model.ObjectKind com.intellij.database.psi.DbElementImpl.getKind()",
        "value":"column"
        },{
        "name":"navigate",
        "desc":"public void com.intellij.database.psi.DbElementImpl.navigate(boolean,java.lang.String[],com.intellij.database.util.DbImplUtil$TriConsumer<com.intellij.database.util.DdlBuilder, java.util.List<com.intellij.database.model.DasColumn>, com.intellij.database.Dbms>)",
        "value":null
        },{
        "name":"navigate",
        "desc":"public void com.intellij.database.psi.DbElementImpl.navigate(boolean)",
        "value":null
        },{
        "name":"navigate",
        "desc":"public void com.intellij.database.psi.DbElementImpl.navigate(boolean,java.lang.String[],boolean,com.intellij.database.util.DbImplUtil$TriConsumer<com.intellij.database.util.DdlBuilder, java.util.List<com.intellij.database.model.DasColumn>, com.intellij.database.Dbms>)",
        "value":null
        },{
        "name":"processChildren",
        "desc":"public boolean com.intellij.database.psi.DbElementImpl.processChildren(com.intellij.psi.search.PsiElementProcessor<com.intellij.psi.PsiFileSystemItem>)",
        "value":null
        },{
        "name":"checkSetName",
        "desc":"public void com.intellij.database.psi.DbElementImpl.checkSetName(java.lang.String) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"canNavigate",
        "desc":"public boolean com.intellij.database.psi.DbElementImpl.canNavigate()",
        "value":null
        },{
        "name":"canNavigateToSource",
        "desc":"public boolean com.intellij.database.psi.DbElementImpl.canNavigateToSource()",
        "value":null
        },{
        "name":"getLocationString",
        "desc":"public java.lang.String com.intellij.database.psi.DbElementImpl.getLocationString()",
        "value":"yaocao3.yc_goods [10.10.13.76]"
        },{
        "name":"isValid",
        "desc":"public boolean com.intellij.database.psi.DbElementImpl.isValid()",
        "value":"true"
        },{
        "name":"getManager",
        "desc":"public com.intellij.psi.PsiManager com.intellij.database.psi.DbElementImpl.getManager()",
        "value":"com.intellij.psi.impl.PsiManagerImpl@4f0b88ec"
        },{
        "name":"getIcon",
        "desc":"public javax.swing.Icon com.intellij.database.psi.DbElementImpl.getIcon()",
        "value":"Deferred. Base=jar:file:/Applications/IntelliJ%20IDEA.app/Contents/plugins/DatabaseTools/lib/database-openapi.jar!/icons/col.svg"
        },{
        "name":"getIcon",
        "desc":"public javax.swing.Icon com.intellij.database.psi.DbElementImpl.getIcon(boolean)",
        "value":null
        },{
        "name":"getComment",
        "desc":"public java.lang.String com.intellij.database.psi.DbElementImpl.getComment()",
        "value":null
        },{
        "name":"getPosition",
        "desc":"public short com.intellij.database.psi.DbElementImpl.getPosition()",
        "value":"1"
        },{
        "name":"getChildren",
        "desc":"public com.intellij.psi.PsiElement[] com.intellij.database.psi.DbElementImpl.getChildren()",
        "value":"[Lcom.intellij.psi.PsiElement;@2246fedf"
        },{
        "name":"isDirectory",
        "desc":"public boolean com.intellij.database.psi.DbElementImpl.isDirectory()",
        "value":"false"
        },{
        "name":"isWritable",
        "desc":"public boolean com.intellij.database.psi.DbElementImpl.isWritable()",
        "value":"true"
        },{
        "name":"getDeclaration",
        "desc":"public com.intellij.psi.PsiElement com.intellij.database.psi.DbElementImpl.getDeclaration()",
        "value":"column:id"
        },{
        "name":"getNode",
        "desc":"public com.intellij.lang.ASTNode com.intellij.psi.impl.FakePsiElement.getNode()",
        "value":null
        },{
        "name":"isPhysical",
        "desc":"public boolean com.intellij.psi.impl.FakePsiElement.isPhysical()",
        "value":"false"
        },{
        "name":"getNextSibling",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getNextSibling()",
        "value":null
        },{
        "name":"getFirstChild",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getFirstChild()",
        "value":null
        },{
        "name":"getLastChild",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getLastChild()",
        "value":null
        },{
        "name":"getPrevSibling",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getPrevSibling()",
        "value":null
        },{
        "name":"getTextRange",
        "desc":"public com.intellij.openapi.util.TextRange com.intellij.psi.impl.FakePsiElement.getTextRange()",
        "value":null
        },{
        "name":"getStartOffsetInParent",
        "desc":"public int com.intellij.psi.impl.FakePsiElement.getStartOffsetInParent()",
        "value":"0"
        },{
        "name":"findElementAt",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.findElementAt(int)",
        "value":null
        },{
        "name":"getTextOffset",
        "desc":"public int com.intellij.psi.impl.FakePsiElement.getTextOffset()",
        "value":"0"
        },{
        "name":"textToCharArray",
        "desc":"public char[] com.intellij.psi.impl.FakePsiElement.textToCharArray()",
        "value":null
        },{
        "name":"textContains",
        "desc":"public boolean com.intellij.psi.impl.FakePsiElement.textContains(char)",
        "value":null
        },{
        "name":"getPresentableText",
        "desc":"public java.lang.String com.intellij.psi.impl.FakePsiElement.getPresentableText()",
        "value":"id"
        },{
        "name":"getPresentation",
        "desc":"public com.intellij.navigation.ItemPresentation com.intellij.psi.impl.FakePsiElement.getPresentation()",
        "value":"column:id"
        },{
        "name":"getIcon",
        "desc":"public final javax.swing.Icon com.intellij.psi.impl.FakePsiElement.getIcon(int)",
        "value":null
        },{
        "name":"getTextLength",
        "desc":"public int com.intellij.psi.impl.FakePsiElement.getTextLength()",
        "value":"0"
        },{
        "name":"add",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.add(com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"replace",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.replace(com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"checkDelete",
        "desc":"public void com.intellij.psi.impl.PsiElementBase.checkDelete() throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"delete",
        "desc":"public void com.intellij.psi.impl.PsiElementBase.delete() throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"accept",
        "desc":"public void com.intellij.psi.impl.PsiElementBase.accept(com.intellij.psi.PsiElementVisitor)",
        "value":null
        },{
        "name":"getContext",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.getContext()",
        "value":"table:yc_goods"
        },{
        "name":"copy",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.copy()",
        "value":null
        },{
        "name":"addBefore",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addBefore(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"addAfter",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addAfter(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"checkAdd",
        "desc":"public void com.intellij.psi.impl.PsiElementBase.checkAdd(com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"getContainingFile",
        "desc":"public com.intellij.psi.PsiFile com.intellij.psi.impl.PsiElementBase.getContainingFile()",
        "value":null
        },{
        "name":"findReferenceAt",
        "desc":"public com.intellij.psi.PsiReference com.intellij.psi.impl.PsiElementBase.findReferenceAt(int)",
        "value":null
        },{
        "name":"getNavigationElement",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.getNavigationElement()",
        "value":"column:id"
        },{
        "name":"getOriginalElement",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.getOriginalElement()",
        "value":"column:id"
        },{
        "name":"textMatches",
        "desc":"public boolean com.intellij.psi.impl.PsiElementBase.textMatches(java.lang.CharSequence)",
        "value":null
        },{
        "name":"textMatches",
        "desc":"public boolean com.intellij.psi.impl.PsiElementBase.textMatches(com.intellij.psi.PsiElement)",
        "value":null
        },{
        "name":"addRangeBefore",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addRangeBefore(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"addRangeAfter",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addRangeAfter(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"deleteChildRange",
        "desc":"public void com.intellij.psi.impl.PsiElementBase.deleteChildRange(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"getReference",
        "desc":"public com.intellij.psi.PsiReference com.intellij.psi.impl.PsiElementBase.getReference()",
        "value":null
        },{
        "name":"getReferences",
        "desc":"public com.intellij.psi.PsiReference[] com.intellij.psi.impl.PsiElementBase.getReferences()",
        "value":"[Lcom.intellij.psi.PsiReference;@3b2520da"
        },{
        "name":"getResolveScope",
        "desc":"public com.intellij.psi.search.GlobalSearchScope com.intellij.psi.impl.PsiElementBase.getResolveScope()",
        "value":"Project and Libraries"
        },{
        "name":"getUseScope",
        "desc":"public com.intellij.psi.search.SearchScope com.intellij.psi.impl.PsiElementBase.getUseScope()",
        "value":"Project and Libraries"
        },{
        "name":"isEquivalentTo",
        "desc":"public boolean com.intellij.psi.impl.PsiElementBase.isEquivalentTo(com.intellij.psi.PsiElement)",
        "value":null
        },{
        "name":"addRange",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addRange(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"createLayeredIcon",
        "desc":"public static com.intellij.ui.RowIcon com.intellij.psi.impl.ElementBase.createLayeredIcon(com.intellij.openapi.util.Iconable,javax.swing.Icon,int)",
        "value":null
        },{
        "name":"registerIconLayer",
        "desc":"public static void com.intellij.psi.impl.ElementBase.registerIconLayer(int,javax.swing.Icon)",
        "value":null
        },{
        "name":"isNativeFileType",
        "desc":"public static boolean com.intellij.psi.impl.ElementBase.isNativeFileType(com.intellij.openapi.fileTypes.FileType)",
        "value":null
        },{
        "name":"overlayIcons",
        "desc":"public static javax.swing.Icon com.intellij.psi.impl.ElementBase.overlayIcons(javax.swing.Icon...)",
        "value":null
        },{
        "name":"buildRowIcon",
        "desc":"public static com.intellij.ui.icons.RowIcon com.intellij.psi.impl.ElementBase.buildRowIcon(javax.swing.Icon,javax.swing.Icon)",
        "value":null
        },{
        "name":"iconWithVisibilityIfNeeded",
        "desc":"public static javax.swing.Icon com.intellij.psi.impl.ElementBase.iconWithVisibilityIfNeeded(int,javax.swing.Icon,javax.swing.Icon)",
        "value":null
        },{
        "name":"transformFlags",
        "desc":"public static int com.intellij.psi.impl.ElementBase.transformFlags(com.intellij.psi.PsiElement,int)",
        "value":null
        },{
        "name":"replace",
        "desc":"public <T> boolean com.intellij.openapi.util.UserDataHolderBase.replace(com.intellij.openapi.util.Key<T>,T,T)",
        "value":null
        },{
        "name":"getUserDataString",
        "desc":"public java.lang.String com.intellij.openapi.util.UserDataHolderBase.getUserDataString()",
        "value":"{CACHED_SMART_POINTER_KEY=com.intellij.reference.SoftReference@c062f2f}"
        },{
        "name":"copyUserDataTo",
        "desc":"public void com.intellij.openapi.util.UserDataHolderBase.copyUserDataTo(com.intellij.openapi.util.UserDataHolderBase)",
        "value":null
        },{
        "name":"getCopyableUserData",
        "desc":"public <T> T com.intellij.openapi.util.UserDataHolderBase.getCopyableUserData(com.intellij.openapi.util.Key<T>)",
        "value":null
        },{
        "name":"putCopyableUserData",
        "desc":"public <T> void com.intellij.openapi.util.UserDataHolderBase.putCopyableUserData(com.intellij.openapi.util.Key<T>,T)",
        "value":null
        },{
        "name":"putUserDataIfAbsent",
        "desc":"public <T> T com.intellij.openapi.util.UserDataHolderBase.putUserDataIfAbsent(com.intellij.openapi.util.Key<T>,T)",
        "value":null
        },{
        "name":"copyCopyableDataTo",
        "desc":"public void com.intellij.openapi.util.UserDataHolderBase.copyCopyableDataTo(com.intellij.openapi.util.UserDataHolderBase)",
        "value":null
        },{
        "name":"isUserDataEmpty",
        "desc":"public boolean com.intellij.openapi.util.UserDataHolderBase.isUserDataEmpty()",
        "value":"false"
        },{
        "name":"putUserData",
        "desc":"public <T> void com.intellij.openapi.util.UserDataHolderBase.putUserData(com.intellij.openapi.util.Key<T>,T)",
        "value":null
        },{
        "name":"getUserData",
        "desc":"public <T> T com.intellij.openapi.util.UserDataHolderBase.getUserData(com.intellij.openapi.util.Key<T>)",
        "value":null
        },{
        "name":"getTextRangeInParent",
        "desc":"public default com.intellij.openapi.util.TextRange com.intellij.psi.PsiElement.getTextRangeInParent()",
        "value":"(0,0)"
        },{
        "name":"getDbParent",
        "desc":"public default com.intellij.database.model.DasObject com.intellij.database.model.DasObject.getDbParent()",
        "value":"table:yc_goods"
        },{
        "name":"getDbChildren",
        "desc":"public default <C> com.intellij.util.containers.JBIterable<C> com.intellij.database.model.DasObject.getDbChildren(java.lang.Class<C>,com.intellij.database.model.ObjectKind)",
        "value":null
        },{
        "name":"getDependencies",
        "desc":"public default java.lang.Object[] com.intellij.psi.meta.PsiMetaData.getDependencies()",
        "value":"[Ljava.lang.Object;@14939837"
        },{
        "name":"getDependences",
        "desc":"public default java.lang.Object[] com.intellij.psi.meta.PsiMetaData.getDependences()",
        "value":"[Ljava.lang.Object;@14939837"
        },{
        "name":"getTableName",
        "desc":"public default java.lang.String com.intellij.database.model.DasColumn.getTableName()",
        "value":"yc_goods"
        }],
        "----":"-----------------我是一条华丽的分割线-----------------",
        "fieldList":[{
        "name":"LOG",
        "type":"com.intellij.openapi.diagnostic.Logger",
        "value":"com.intellij.idea.IdeaLogger@7481ed54"
        },{
        "name":"WEIGHT_BASE",
        "type":"int",
        "value":"10000"
        },{
        "name":"WEIGHT_INC",
        "type":"int",
        "value":"1000"
        },{
        "name":"myParent",
        "type":"com.intellij.database.psi.DbElement",
        "value":"table:yc_goods"
        },{
        "name":"myDelegate",
        "type":"java.lang.Object",
        "value":"id: column"
        },{
        "name":"myTransactionalVersion",
        "type":"long",
        "value":"3"
        },{
        "name":"ASYNC_DOC_CUT",
        "type":"java.lang.String",
        "value":"<!-- async-doc-cut -->"
        },{
        "name":"LOG",
        "type":"com.intellij.openapi.diagnostic.Logger",
        "value":"com.intellij.idea.IdeaLogger@23a5242a"
        },{
        "name":"LOG",
        "type":"com.intellij.openapi.diagnostic.Logger",
        "value":"com.intellij.idea.IdeaLogger@41e9ffd9"
        },{
        "name":"FLAGS_LOCKED",
        "type":"int",
        "value":"2048"
        },{
        "name":"ICON_COMPUTE",
        "type":"java.util.function.Function",
        "value":"com.intellij.psi.impl.ElementBase$$Lambda$1529/0x00000008010ec840@785ced87"
        },{
        "name":"VISIBILITY_ICON_PLACEHOLDER",
        "type":"com.intellij.openapi.util.NotNullLazyValue",
        "value":"com.intellij.psi.impl.ElementBase$1@34c4495"
        },{
        "name":"ICON_PLACEHOLDER",
        "type":"com.intellij.openapi.util.NotNullLazyValue",
        "value":"com.intellij.psi.impl.ElementBase$2@942a4a2"
        },{
        "name":"COPYABLE_USER_MAP_KEY",
        "type":"com.intellij.openapi.util.Key",
        "value":"COPYABLE_USER_MAP_KEY"
        },{
        "name":"myUserMap",
        "type":"com.intellij.util.keyFMap.KeyFMap",
        "value":"{CACHED_SMART_POINTER_KEY=com.intellij.reference.SoftReference@c062f2f}"
        },{
        "name":"updater",
        "type":"com.intellij.util.concurrency.AtomicFieldUpdater",
        "value":"com.intellij.util.concurrency.AtomicFieldUpdater@75b8564"
        }]
        }

//调试列原始列类型
        {
        "title":"调试：com.intellij.database.model.DataType",
        "methodList":[{
        "name":"getLength",
        "desc":"public int com.intellij.database.model.DataType.getLength()",
        "value":"10"
        },{
        "name":"getScale",
        "desc":"public int com.intellij.database.model.DataType.getScale()",
        "value":"0"
        },{
        "name":"withTypeName",
        "desc":"public com.intellij.database.model.DataType com.intellij.database.model.DataType.withTypeName(java.lang.String)",
        "value":null
        },{
        "name":"getSpecification",
        "desc":"public java.lang.String com.intellij.database.model.DataType.getSpecification(boolean,boolean)",
        "value":null
        },{
        "name":"getSpecification",
        "desc":"public java.lang.String com.intellij.database.model.DataType.getSpecification()",
        "value":"int(10) unsigned"
        },{
        "name":"equalsWithoutJdbc",
        "desc":"public boolean com.intellij.database.model.DataType.equalsWithoutJdbc(com.intellij.database.model.DataType)",
        "value":null
        },{
        "name":"getPrecision",
        "desc":"public int com.intellij.database.model.DataType.getPrecision()",
        "value":"10"
        }],
        "----":"-----------------我是一条华丽的分割线-----------------",
        "fieldList":[{
        "name":"MAX_SIZE",
        "type":"int",
        "value":"2147483647"
        },{
        "name":"STAR_SIZE",
        "type":"int",
        "value":"2147483646"
        },{
        "name":"NO_SIZE",
        "type":"int",
        "value":"-1"
        },{
        "name":"NO_SCALE",
        "type":"int",
        "value":"0"
        },{
        "name":"UNKNOWN",
        "type":"com.intellij.database.model.DataType",
        "value":"unknown"
        },{
        "name":"schemaName",
        "type":"java.lang.String",
        "value":null
        },{
        "name":"packageName",
        "type":"java.lang.String",
        "value":null
        },{
        "name":"typeName",
        "type":"java.lang.String",
        "value":"int"
        },{
        "name":"size",
        "type":"int",
        "value":"10"
        },{
        "name":"scale",
        "type":"int",
        "value":"0"
        },{
        "name":"sizeUnit",
        "type":"com.intellij.database.model.LengthUnit",
        "value":"com.intellij.database.model.LengthUnit@10a557bf"
        },{
        "name":"vagueArg",
        "type":"java.lang.String",
        "value":null
        },{
        "name":"suffix",
        "type":"java.lang.String",
        "value":"unsigned"
        },{
        "name":"sizeUnitExplicit",
        "type":"boolean",
        "value":"false"
        },{
        "name":"custom",
        "type":"boolean",
        "value":"false"
        },{
        "name":"enumValues",
        "type":"java.util.List",
        "value":null
        },{
        "name":"jdbcType",
        "type":"int",
        "value":"0"
        }]
        }

//获取原始列类型中的字段
        sqlType=int

//执行原始列类型中的方法
        sqlTypeLen=10