package neatlogic.framework.knowledge.constvalue;

import neatlogic.framework.knowledge.dto.KnowledgeDocumentLineVo;
import neatlogic.framework.util.I18nUtils;

import java.util.function.BiConsumer;
import java.util.function.Function;

public enum KnowledgeDocumentLineHandler {

    P("p", "enum.knowledge.knowledgedocumentlinehandler.p", (line) -> line.getContent(), (line, mainBody) -> line.setContent(mainBody)),
    H1("h1", "enum.knowledge.knowledgedocumentlinehandler.h1", (line) -> line.getContent(), (line, mainBody) -> line.setContent(mainBody)),
    H2("h2", "enum.knowledge.knowledgedocumentlinehandler.h2", (line) -> line.getContent(), (line, mainBody) -> line.setContent(mainBody)),
    IMG("img", "enum.knowledge.knowledgedocumentlinehandler.img", (line) -> line.getConfig().getString("url"), null),
    TABLE("table", "enum.knowledge.knowledgedocumentlinehandler.table", (line) -> line.getConfig().getString("tableList"), null),
    CODE("code", "enum.knowledge.knowledgedocumentlinehandler.code", (line) -> line.getConfig().getString("value"), null),
    FORMTABLE("formtable", "enum.knowledge.knowledgedocumentlinehandler.formtable", (line) -> line.getContent(), (line, mainBody) -> line.setContent(mainBody)),
    EDITOR("editor", "enum.knowledge.knowledgedocumentlinehandler.editor", (line) -> line.getContent(), (line, mainBody) -> line.setContent(mainBody)),
    UL("ul", "enum.knowledge.knowledgedocumentlinehandler.ul", (line) -> line.getContent(), (line, mainBody) -> line.setContent(mainBody)),
    OL("ol", "enum.knowledge.knowledgedocumentlinehandler.ol", (line) -> line.getContent(), (line, mainBody) -> line.setContent(mainBody))
    ;
    private String value;
    private String text;
    private Function<KnowledgeDocumentLineVo, String> mainBodyGet;
    private BiConsumer<KnowledgeDocumentLineVo, String> mainBodySet;
    private KnowledgeDocumentLineHandler(String value, String text, Function<KnowledgeDocumentLineVo, String> mainBodyGet, BiConsumer<KnowledgeDocumentLineVo, String> mainBodySet) {
        this.value = value;
        this.text = text;
        this.mainBodyGet = mainBodyGet;
        this.mainBodySet = mainBodySet;
    }
    public String getValue() {
        return value;
    }

    public String getText() {
        return I18nUtils.getMessage(text);
    }

//    public static BiConsumer<KnowledgeDocumentLineVo, String> getMainBodySet(String _value){
//        for(KnowledgeDocumentLineHandler handler : values()) {
//            if(handler.value.equals(_value)) {
//                return handler.mainBodySet;
//            }
//        }
//        return null;
//    }
//    public static String getMainBody(KnowledgeDocumentLineVo line){
//        for(KnowledgeDocumentLineHandler handler : values()) {
//            if(handler.value.equals(line.getHandler())) {
//                if(handler.mainBodyGet != null) {
//                    return handler.mainBodyGet.apply(line);
//                }
//                return null;
//            }
//        }
//        return null;
//    }
//    public static void setMainBody(KnowledgeDocumentLineVo line, String mainBody){
//        for(KnowledgeDocumentLineHandler handler : values()) {
//            if(handler.value.equals(line.getHandler())) {
//                if(handler.mainBodySet != null) {
//                    handler.mainBodySet.accept(line, mainBody);
//                }
//                return;
//            }
//        }
//    }
}
