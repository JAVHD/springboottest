//调试表原始对象
{
        "title":"调试：com.intellij.database.psi.DbTableImpl",
        "methodList":[{
        "name":"getDocumentation",
        "desc":"public java.lang.StringBuilder com.intellij.database.psi.DbTableImpl.getDocumentation()",
        "value":"<html><body><b>Data Source:</b> 10.10.13.76<br><b>Schema:</b> yaocao3<br><b>Table:</b> yc_article<br><br><font color=\"#808080\">-- 文章</font><br><code><pre><font color=\"#808080\">-- auto-generated definition</font>\n<font color=\"#cc7832\">create</font> <font color=\"#cc7832\">table</font> yc_article\n(\n    id             <font color=\"#cc7832\">int</font> <font color=\"#cc7832\">unsigned</font> <font color=\"#cc7832\">auto_increment</font><font color=\"#cc7832\">,</font>\n    cat_id         <font color=\"#cc7832\">mediumint</font> <font color=\"#cc7832\">unsigned</font>  <font color=\"#cc7832\">default</font> <font color=\"#6897bb\">0</font> <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;文章分类&#39;</font><font color=\"#cc7832\">,</font>\n    create_id      <font color=\"#cc7832\">int</font> <font color=\"#cc7832\">unsigned</font>        <font color=\"#cc7832\">default</font> <font color=\"#6897bb\">0</font> <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;文章编辑人id&#39;</font><font color=\"#cc7832\">,</font>\n    update_id      <font color=\"#cc7832\">int</font> <font color=\"#cc7832\">unsigned</font>        <font color=\"#cc7832\">default</font> <font color=\"#6897bb\">0</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;更新人&#39;</font><font color=\"#cc7832\">,</font>\n    title          <font color=\"#cc7832\">varchar</font>(<font color=\"#6897bb\">100</font>) <font color=\"#cc7832\">charset</font> utf8mb4  <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;文章标题&#39;</font><font color=\"#cc7832\">,</font>\n    <font color=\"#cc7832\">source</font>         <font color=\"#cc7832\">varchar</font>(<font color=\"#6897bb\">30</font>) <font color=\"#cc7832\">charset</font> utf8mb4   <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;文章来源&#39;</font><font color=\"#cc7832\">,</font>\n    redirect_url   <font color=\"#cc7832\">varchar</font>(<font color=\"#6897bb\">300</font>)                  <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;跳转链接&#39;</font><font color=\"#cc7832\">,</font>\n    content        <font color=\"#cc7832\">text</font> <font color=\"#cc7832\">charset</font> utf8mb4          <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;文章内容&#39;</font><font color=\"#cc7832\">,</font>\n    attachment_url <font color=\"#cc7832\">varchar</font>(<font color=\"#6897bb\">300</font>) <font color=\"#cc7832\">charset</font> utf8mb4  <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;附件地址&#39;</font><font color=\"#cc7832\">,</font>\n    sort           <font color=\"#cc7832\">mediumint</font> <font color=\"#cc7832\">unsigned</font>  <font color=\"#cc7832\">default</font> <font color=\"#6897bb\">0</font> <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;排序&#39;</font><font color=\"#cc7832\">,</font>\n    is_delete      <font color=\"#cc7832\">tinyint</font>(<font color=\"#6897bb\">1</font>) <font color=\"#cc7832\">unsigned</font> <font color=\"#cc7832\">default</font> <font color=\"#6897bb\">0</font> <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;0未删除；1已经删除&#39;</font><font color=\"#cc7832\">,</font>\n    publish_time   <font color=\"#cc7832\">int</font> <font color=\"#cc7832\">unsigned</font>                  <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;文章发表时间&#39;</font><font color=\"#cc7832\">,</font>\n    create_time    <font color=\"#cc7832\">int</font> <font color=\"#cc7832\">unsigned</font>                  <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;创建时间&#39;</font><font color=\"#cc7832\">,</font>\n    update_time    <font color=\"#cc7832\">int</font> <font color=\"#cc7832\">unsigned</font>                  <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;更新时间&#39;</font><font color=\"#cc7832\">,</font>\n    <font color=\"#cc7832\">primary</font> <font color=\"#cc7832\">key</font> (id<font color=\"#cc7832\">,</font> update_time)\n)\n    <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;文章&#39;</font><font color=\"#cc7832\">;</font>\n\n<font color=\"#cc7832\">create</font> <font color=\"#cc7832\">index</font> is_delete\n    <font color=\"#cc7832\">on</font> yc_article (is_delete)<font color=\"#cc7832\">;</font>\n\n<font color=\"#cc7832\">create</font> <font color=\"#cc7832\">index</font> title\n    <font color=\"#cc7832\">on</font> yc_article (title)<font color=\"#cc7832\">;</font></pre></code>"
        },{
        "name":"getDocumentation",
        "desc":"public java.lang.CharSequence com.intellij.database.psi.DbTableImpl.getDocumentation()",
        "value":"<html><body><b>Data Source:</b> 10.10.13.76<br><b>Schema:</b> yaocao3<br><b>Table:</b> yc_article<br><br><font color=\"#808080\">-- 文章</font><br><code><pre><font color=\"#808080\">-- auto-generated definition</font>\n<font color=\"#cc7832\">create</font> <font color=\"#cc7832\">table</font> yc_article\n(\n    id             <font color=\"#cc7832\">int</font> <font color=\"#cc7832\">unsigned</font> <font color=\"#cc7832\">auto_increment</font><font color=\"#cc7832\">,</font>\n    cat_id         <font color=\"#cc7832\">mediumint</font> <font color=\"#cc7832\">unsigned</font>  <font color=\"#cc7832\">default</font> <font color=\"#6897bb\">0</font> <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;文章分类&#39;</font><font color=\"#cc7832\">,</font>\n    create_id      <font color=\"#cc7832\">int</font> <font color=\"#cc7832\">unsigned</font>        <font color=\"#cc7832\">default</font> <font color=\"#6897bb\">0</font> <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;文章编辑人id&#39;</font><font color=\"#cc7832\">,</font>\n    update_id      <font color=\"#cc7832\">int</font> <font color=\"#cc7832\">unsigned</font>        <font color=\"#cc7832\">default</font> <font color=\"#6897bb\">0</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;更新人&#39;</font><font color=\"#cc7832\">,</font>\n    title          <font color=\"#cc7832\">varchar</font>(<font color=\"#6897bb\">100</font>) <font color=\"#cc7832\">charset</font> utf8mb4  <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;文章标题&#39;</font><font color=\"#cc7832\">,</font>\n    <font color=\"#cc7832\">source</font>         <font color=\"#cc7832\">varchar</font>(<font color=\"#6897bb\">30</font>) <font color=\"#cc7832\">charset</font> utf8mb4   <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;文章来源&#39;</font><font color=\"#cc7832\">,</font>\n    redirect_url   <font color=\"#cc7832\">varchar</font>(<font color=\"#6897bb\">300</font>)                  <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;跳转链接&#39;</font><font color=\"#cc7832\">,</font>\n    content        <font color=\"#cc7832\">text</font> <font color=\"#cc7832\">charset</font> utf8mb4          <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;文章内容&#39;</font><font color=\"#cc7832\">,</font>\n    attachment_url <font color=\"#cc7832\">varchar</font>(<font color=\"#6897bb\">300</font>) <font color=\"#cc7832\">charset</font> utf8mb4  <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;附件地址&#39;</font><font color=\"#cc7832\">,</font>\n    sort           <font color=\"#cc7832\">mediumint</font> <font color=\"#cc7832\">unsigned</font>  <font color=\"#cc7832\">default</font> <font color=\"#6897bb\">0</font> <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;排序&#39;</font><font color=\"#cc7832\">,</font>\n    is_delete      <font color=\"#cc7832\">tinyint</font>(<font color=\"#6897bb\">1</font>) <font color=\"#cc7832\">unsigned</font> <font color=\"#cc7832\">default</font> <font color=\"#6897bb\">0</font> <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;0未删除；1已经删除&#39;</font><font color=\"#cc7832\">,</font>\n    publish_time   <font color=\"#cc7832\">int</font> <font color=\"#cc7832\">unsigned</font>                  <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;文章发表时间&#39;</font><font color=\"#cc7832\">,</font>\n    create_time    <font color=\"#cc7832\">int</font> <font color=\"#cc7832\">unsigned</font>                  <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;创建时间&#39;</font><font color=\"#cc7832\">,</font>\n    update_time    <font color=\"#cc7832\">int</font> <font color=\"#cc7832\">unsigned</font>                  <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;更新时间&#39;</font><font color=\"#cc7832\">,</font>\n    <font color=\"#cc7832\">primary</font> <font color=\"#cc7832\">key</font> (id<font color=\"#cc7832\">,</font> update_time)\n)\n    <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;文章&#39;</font><font color=\"#cc7832\">;</font>\n\n<font color=\"#cc7832\">create</font> <font color=\"#cc7832\">index</font> is_delete\n    <font color=\"#cc7832\">on</font> yc_article (is_delete)<font color=\"#cc7832\">;</font>\n\n<font color=\"#cc7832\">create</font> <font color=\"#cc7832\">index</font> title\n    <font color=\"#cc7832\">on</font> yc_article (title)<font color=\"#cc7832\">;</font></pre></code>"
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
        "value":"yc_article"
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
        "value":"yc_article: table"
        },{
        "name":"getVirtualFile",
        "desc":"public com.intellij.openapi.vfs.VirtualFile com.intellij.database.psi.DbElementImpl.getVirtualFile()",
        "value":"DB VirtualFile: table, yaocao3.yc_article [10.10.13.76] (Valid)"
        },{
        "name":"isCaseSensitive",
        "desc":"public boolean com.intellij.database.psi.DbElementImpl.isCaseSensitive()",
        "value":"true"
        },{
        "name":"getMetaData",
        "desc":"public com.intellij.psi.meta.PsiMetaData com.intellij.database.psi.DbElementImpl.getMetaData()",
        "value":"table:yc_article"
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
        "value":"create table yc_article\n(\n    id             int unsigned auto_increment,\n    cat_id         mediumint unsigned  default 0 not null comment '文章分类',\n    create_id      int unsigned        default 0 not null comment '文章编辑人id',\n    update_id      int unsigned        default 0 null comment '更新人',\n    title          varchar(100) charset utf8mb4  not null comment '文章标题',\n    source         varchar(30) charset utf8mb4   null comment '文章来源',\n    redirect_url   varchar(300)                  not null comment '跳转链接',\n    content        text charset utf8mb4          null comment '文章内容',\n    attachment_url varchar(300) charset utf8mb4  null comment '附件地址',\n    sort           mediumint unsigned  default 0 not null comment '排序',\n    is_delete      tinyint(1) unsigned default 0 not null comment '0未删除；1已经删除',\n    publish_time   int unsigned                  not null comment '文章发表时间',\n    create_time    int unsigned                  not null comment '创建时间',\n    update_time    int unsigned                  not null comment '更新时间',\n    primary key (id, update_time)\n)\n    comment '文章';\n\ncreate index is_delete\n    on yc_article (is_delete);\n\ncreate index title\n    on yc_article (title);\n\n"
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
        "value":"文章"
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
        "value":"table:yc_article"
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
        "value":"yc_article"
        },{
        "name":"getPresentation",
        "desc":"public com.intellij.navigation.ItemPresentation com.intellij.psi.impl.FakePsiElement.getPresentation()",
        "value":"table:yc_article"
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
        "value":"table:yc_article"
        },{
        "name":"getOriginalElement",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.getOriginalElement()",
        "value":"table:yc_article"
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
        "value":"{COLOR_KEY=com.intellij.database.view.DatabaseColorManager$CachedColor@5af8ceb7, lastComputedIcon={0=Row icon. myIcons=[jar:file:/Applications/IntelliJ%20IDEA.app/Contents/plugins/DatabaseTools/lib/database-openapi.jar!/icons/table.svg, null]}, CACHED_SMART_POINTER_KEY=com.intellij.reference.SoftReference@3b71d03}"
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
        "value":"yc_article: table"
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
        "value":"{COLOR_KEY=com.intellij.database.view.DatabaseColorManager$CachedColor@5af8ceb7, lastComputedIcon={0=Row icon. myIcons=[jar:file:/Applications/IntelliJ%20IDEA.app/Contents/plugins/DatabaseTools/lib/database-openapi.jar!/icons/table.svg, null]}, CACHED_SMART_POINTER_KEY=com.intellij.reference.SoftReference@3b71d03}"
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
        "value":"table:yc_article"
        },{
        "name":"getParent",
        "desc":"public com.intellij.database.psi.DbElement com.intellij.database.psi.DbColumnImpl.getParent()",
        "value":"table:yc_article"
        },{
        "name":"getParent",
        "desc":"public com.intellij.database.psi.DbTable com.intellij.database.psi.DbColumnImpl.getParent()",
        "value":"table:yc_article"
        },{
        "name":"getParent",
        "desc":"public com.intellij.psi.PsiFileSystemItem com.intellij.database.psi.DbColumnImpl.getParent()",
        "value":"table:yc_article"
        },{
        "name":"isNotNull",
        "desc":"public boolean com.intellij.database.psi.DbColumnImpl.isNotNull()",
        "value":"true"
        },{
        "name":"getDocumentation",
        "desc":"public java.lang.StringBuilder com.intellij.database.psi.DbColumnImpl.getDocumentation()",
        "value":"<html><body><b>Data Source:</b> 10.10.13.76<br><b>Schema:</b> yaocao3<br><b>Table:</b> yc_article<br><b>Column:</b> id<br><br><code><pre><font color=\"#cc7832\">alter</font> <font color=\"#cc7832\">table</font> yc_article\n    <font color=\"#cc7832\">add</font> id <font color=\"#cc7832\">int</font> <font color=\"#cc7832\">unsigned</font> <font color=\"#cc7832\">auto_increment</font><font color=\"#cc7832\">;</font>\n\n</pre></code>"
        },{
        "name":"getDocumentation",
        "desc":"public java.lang.CharSequence com.intellij.database.psi.DbColumnImpl.getDocumentation()",
        "value":"<html><body><b>Data Source:</b> 10.10.13.76<br><b>Schema:</b> yaocao3<br><b>Table:</b> yc_article<br><b>Column:</b> id<br><br><code><pre><font color=\"#cc7832\">alter</font> <font color=\"#cc7832\">table</font> yc_article\n    <font color=\"#cc7832\">add</font> id <font color=\"#cc7832\">int</font> <font color=\"#cc7832\">unsigned</font> <font color=\"#cc7832\">auto_increment</font><font color=\"#cc7832\">;</font>\n\n</pre></code>"
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
        "value":"table:yc_article"
        },{
        "name":"getTable",
        "desc":"public com.intellij.database.psi.DbTable com.intellij.database.psi.DbColumnImpl.getTable()",
        "value":"table:yc_article"
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
        "value":"DB VirtualFile: column, yaocao3.yc_article.id [10.10.13.76] (Valid)"
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
        "value":"table:yc_article"
        },{
        "name":"getDasParent",
        "desc":"public com.intellij.database.model.DasObject com.intellij.database.psi.DbElementImpl.getDasParent()",
        "value":"table:yc_article"
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
        "value":"alter table yc_article\n    add id int unsigned auto_increment;\n\n"
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
        "value":"yaocao3.yc_article [10.10.13.76]"
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
        "value":"table:yc_article"
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
        "value":"{CACHED_SMART_POINTER_KEY=com.intellij.reference.SoftReference@221b049}"
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
        "value":"table:yc_article"
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
        "value":"yc_article"
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
        "value":"table:yc_article"
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
        "value":"{CACHED_SMART_POINTER_KEY=com.intellij.reference.SoftReference@221b049}"
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