FROM nginx
add proxy/proxy.conf /etc/nginx/conf.d/default.conf
add proxy/index.html /etc/nginx/html/index.html
add proxy/Documentacion.html /etc/nginx/html/Documentacion.html
add proxy/LogoUV.png /etc/nginx/html/LogoUV.png
CMD sed -i -e 's/$PORT/'"$PORT"'/g' /etc/nginx/conf.d/default.conf && nginx -g 'daemon off;'