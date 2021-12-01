package org.webgraph.tinkerpop.structure.settings;

/**
 * Provides stub labels for WebGraph edges and vertices.
 */
public class DefaultWebGraphSettings implements WebGraphSettings {
    @Override
    public String vertexLabel(long vertexId) {
        return "vertex";
    }

    @Override
    public String edgeLabel(long fromId, long toId) {
        return "edge";
    }
}
