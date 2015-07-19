<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:i="http://www.w3.org/2001/XMLSchema-instance" 
	xmlns:xs="http://www.w3.org/2001/XMLSchema"
	xmlns:custom="xalan://custom.xpath.CustomXpath">
	
	<xsl:template match="node()">
		<xsl:element name="{custom:toLowerCamelCase(local-name())}">
			<xsl:value-of select="slef:text()"></xsl:value-of>
		</xsl:element>
	</xsl:template>
	
</xsl:stylesheet>